name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.3.0",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.37",
    "ch.qos.logback" % "logback-classic" % "1.2.5",
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
}
