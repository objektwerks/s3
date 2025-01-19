name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.3"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.14",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.780",
    "ch.qos.logback" % "logback-classic" % "1.5.16",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
