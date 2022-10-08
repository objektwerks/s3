name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.9"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.4.5",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.318",
    "ch.qos.logback" % "logback-classic" % "1.4.1",
    "org.scalatest" %% "scalatest" % "3.2.14" % Test
  )
}
