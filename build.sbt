name := """C:\Users\Kyle\Desktop\College\Soph2\web_design\play2torial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final" // replace by your jpa implementation
)

libraryDependencies += "org.webjars" % "jquery" % "1.11.2"

libraryDependencies += "org.webjars" % "bootstrap" % "2.1.1"