name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.0-RC3"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.7",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.650",
    "ch.qos.logback" % "logback-classic" % "1.4.14",
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
