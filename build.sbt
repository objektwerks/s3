name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.7.1-RC1"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "3.7.1-RC1",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.783", // Don't upgrade to "software.amazon.awssdk" % "s3" % "n.n.n"
    "ch.qos.logback" % "logback-classic" % "1.5.18",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
