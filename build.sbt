name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.11"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.3",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.496",
    "ch.qos.logback" % "logback-classic" % "1.4.8",
    "org.scalatest" %% "scalatest" % "3.2.16" % Test
  )
}
