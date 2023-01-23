name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.10"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.4.6",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.353",
    "ch.qos.logback" % "logback-classic" % "1.4.5",
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
}
