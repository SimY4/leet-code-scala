import sbtwelcome.*

ThisBuild / organization := "com.github.simy4"
ThisBuild / version      := "0.1.0"
ThisBuild / scalaVersion := "3.8.3"
Global / cancelable      := true

lazy val root = project
  .in(file("."))
  .settings(
    name := "leet-code",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parallel-collections" % "1.2.0",
      "org.scalameta"          %% "munit"                      % "1.2.4" % Test
    ),
    scalacOptions ++= Seq(
      "-release",
      "21",
      "-encoding",
      "UTF-8",
      "-explain",
      "-explain-types",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-source:future-migration",
      "-preview"
    )
  )

addCommandAlias("fmt", ";scalafmtAll;scalafmtSbt")

logo :=
  raw"""  _           _                   _
       | | | ___  ___| |_    ___ ___   __| | ___
       | | |/ _ \/ _ \ __|  / __/ _ \ / _` |/ _ \
       | | |  __/  __/ |_  | (_| (_) | (_| |  __/
       | |_|\___|\___|\__|  \___\___/ \__,_|\___|
       |""".stripMargin

usefulTasks := Seq(
  UsefulTask("~compile", "Compile with file-watch enabled"),
  UsefulTask("~console", "Run REPL with file-watch enabled"),
  UsefulTask("fmt", "Run scalafmt on the entire project")
)

logoColor := scala.Console.MAGENTA
