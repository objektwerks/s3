name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4-RC1"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.17",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.782", // Don't upgrade to "software.amazon.awssdk" % "s3" % "n.n.n"
    "ch.qos.logback" % "logback-classic" % "1.5.16",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
