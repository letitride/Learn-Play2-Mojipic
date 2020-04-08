name := """mojipic"""
organization := "jp.ed.nnn"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += ehcache
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.1"
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.6"
libraryDependencies += jdbc
libraryDependencies += evolutions

libraryDependencies += "org.scalikejdbc" %% "scalikejdbc"  % "3.4.0"
libraryDependencies += "org.scalikejdbc" %% "scalikejdbc-config" % "3.4.0"
libraryDependencies += "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.8.0-scalikejdbc-3.4"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += "net.debasishg" %% "redisclient" % "3.20"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "jp.ed.nnn.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "jp.ed.nnn.binders._"
