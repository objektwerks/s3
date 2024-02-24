name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.1-RC1"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.7",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.665",
    "ch.qos.logback" % "logback-classic" % "1.5.0",
    "org.scalatest" %% "scalatest" % "3.2.18" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
