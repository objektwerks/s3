package objektwerks

object Conf {
  val minioUrl = "http://127.0.0.1:9000"
  val accessKey = sys.env.getOrElse(key = "MINIO_ACCESS_KEY", default = "minio access key unavailable")
  val secretKey = sys.env.getOrElse(key = "MINIO_SECRET_KEY", default = "minio secret key unavailable")
  val objectName = "gplv3"
  val pathToTextFile = "./gplv3.txt"
}