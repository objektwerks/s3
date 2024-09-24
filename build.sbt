name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.5.1"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.12",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.772",
    "ch.qos.logback" % "logback-classic" % "1.5.8",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
