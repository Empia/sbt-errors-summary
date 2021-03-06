lazy val errorsSummary = project.in(file("."))

version := "0.3.0-SNAPSHOT"
sbtPlugin := true
organization := "org.duhemm"
name := "sbt-errors-summary"
description := "sbt plugin to show a summary of compilation messages."
scalacOptions ++=
  Seq("-deprecation", "-feature", "-unchecked", "-Xlint", "-Ywarn-all")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
