name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.8.0-RC2"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.6.0",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.783", // Don't upgrade to "software.amazon.awssdk" % "s3" % "n.n.n"
    "ch.qos.logback" % "logback-classic" % "1.5.21",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
