package objektwerks

import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.ClientConfiguration
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.regions.Regions
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.services.s3.model.PutObjectRequest
import com.amazonaws.services.s3.model.GetObjectRequest
import com.amazonaws.services.s3.model.DeleteBucketRequest
import com.amazonaws.services.s3.model.CreateBucketRequest

import java.io.File

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class AwsTest extends AnyFunSuite with Matchers:
  import Conf.*

  val bucketName = "aws"

  test("aws") {
    val credentials = new BasicAWSCredentials(accessKey, secretKey)
    val clientConfiguration = new ClientConfiguration()
    clientConfiguration.setSignerOverride("AWSS3V4SignerType")

    val s3Client = AmazonS3ClientBuilder
      .standard
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(minioUrl, Regions.US_EAST_1.name()))
      .withPathStyleAccessEnabled(true)
      .withClientConfiguration(clientConfiguration)
      .withCredentials(new AWSStaticCredentialsProvider(credentials))
      .build

    if (s3Client.doesBucketExistV2(bucketName)) {
      s3Client.deleteBucket(new DeleteBucketRequest(bucketName))
    } else {
      s3Client.createBucket(new CreateBucketRequest(bucketName))
    }

    val textFile = new File(pathToTextFile)
    s3Client.putObject(new PutObjectRequest(bucketName, objectName, textFile))

    val getObjectRequest = new GetObjectRequest(bucketName, objectName)
    val s3Object = s3Client.getObject(getObjectRequest)
    Source.createBufferedSource(s3Object.getObjectContent).getLines().mkString.nonEmpty shouldBe true
  }