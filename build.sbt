name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.1"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.7",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.604",
    "ch.qos.logback" % "logback-classic" % "1.4.13",
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
