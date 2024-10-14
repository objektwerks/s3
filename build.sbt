name := "s3"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.5.2-RC2"
libraryDependencies ++= {
  Seq(
    "io.minio" % "minio" % "8.5.12",
    "com.amazonaws" % "aws-java-sdk-s3" % "1.12.773",
    "ch.qos.logback" % "logback-classic" % "1.5.8",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
