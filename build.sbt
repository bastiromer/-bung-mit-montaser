val scala3Version = "3.2.2"

lazy val root = (
  project in file("."))
  .settings(
    name := "Uebung-mit-montaser", 
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.2.2",

    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
