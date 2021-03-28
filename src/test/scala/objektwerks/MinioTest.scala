package objektwerks

import io.minio.MinioClient
import io.minio.BucketExistsArgs
import io.minio.MakeBucketArgs
import io.minio.PutObjectArgs
import io.minio.RemoveBucketArgs
import io.minio.GetObjectArgs

import java.io.File
import java.io.FileInputStream

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class MinioTest extends AnyFunSuite with Matchers {
  import Conf._

  val bucketName = "minio"
  val textFileSize = 36864L

  test("minio") {
    val minioClient = MinioClient
      .builder
      .endpoint(minioUrl)
      .credentials(accessKey, secretKey)
      .build

    val bucketExistsArgs = BucketExistsArgs
      .builder
      .bucket(bucketName)
      .build
    if ( minioClient.bucketExists(bucketExistsArgs) ) {
      val removeBucketArgs = RemoveBucketArgs
        .builder
        .bucket(bucketName)
        .build
      minioClient.removeBucket(removeBucketArgs)
    } else {
      val makeBucketArgs = MakeBucketArgs
        .builder
        .bucket(bucketName)
        .build
      minioClient.makeBucket(makeBucketArgs)
    }

    val putObjectArgs = PutObjectArgs
      .builder
      .bucket(bucketName)
      .`object`(objectName)
      .stream( new FileInputStream(new File(pathToTextFile) ), textFileSize, -1)
      .contentType("text/plain")
      .build
    minioClient.putObject(putObjectArgs)

    val getObjectArgs = GetObjectArgs
      .builder
      .bucket(bucketName)
      .`object`(objectName)
      .length(textFileSize)
      .build
    val inputStream = minioClient.getObject(getObjectArgs)
    Source.createBufferedSource(inputStream).getLines().mkString.nonEmpty shouldBe true
    inputStream.close()
  }
}