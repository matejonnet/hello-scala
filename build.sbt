import sbt._
//import lmcoursier.definitions._
//import org.jboss.pnc.sbt.plugins._

//logLevel := Level.Debug

name := "Hello"
organization := "org.jboss.pnc.sbt"
version := "0.0.1"

lazy val hello = (project in file("."))
  .settings(
    libraryDependencies += "org.jboss.pnc" % "pnc-api" % "2.0.1",
  )

