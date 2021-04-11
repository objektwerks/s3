name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.5"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.2.0",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.11.996",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.scalatest" %% "scalatest" % "3.2.7" % Test
  )
}
