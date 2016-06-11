import com.typesafe.sbt.packager.Keys.dist
import com.github.sbtliquibase.SbtLiquibase
import com.github.sbtliquibase.Import._

name := "Gara"

scalaVersion := "2.11.6"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava).enablePlugins(SbtLiquibase)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,javaWs
)

libraryDependencies ++= Seq(
  // WebJars pull in client-side web libraries
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "flot" % "0.8.0",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "org.jooq" % "jooq" % "3.8.0",
  "org.jooq" % "jooq-meta" % "3.8.0",
  "org.jooq" % "jooq-scala" % "3.8.0",
  "org.jooq" % "jooq-codegen" % "3.8.0",
  "javax.persistence" % "persistence-api" % "1.0.2",
  "javax.validation" % "validation-api" % "1.1.0.Final",
  "com.fasterxml.uuid" % "java-uuid-generator" % "3.1.3",
  "com.typesafe.play" %% "play-mailer" % "5.0.0-M1",
  "org.mindrot" % "jbcrypt" % "0.3m"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.31" % "jooq"

seq(jooqSettings: _*)

jooqVersion := "3.8.0"

jooqOptions := Seq(
  "jdbc.driver" -> "com.mysql.jdbc.Driver",
  "jdbc.url" -> "jdbc:mysql://209.148.94.217:3306/Gara",
  "jdbc.user" -> "Gara",
  "jdbc.password" -> "123456",
  "generator.database.name" -> "org.jooq.util.mysql.MySQLDatabase",
  "generator.database.inputSchema" -> "Gara",
  "generator.target.directory" -> "./app",
  "generator.target.packageName" -> "apdihp",
  "generator.generate.pojos" -> "true",
  "generator.generate.daos" -> "true",
  "generator.generate.jpaAnnotations" -> "true",
  "generator.generate.validationAnnotations" -> "true",
  "generator.generate.generatedAnnotation" -> "true"
)


liquibaseUsername := "Gara"

liquibasePassword := "123456"

liquibaseDriver   := "com.mysql.jdbc.Driver"

liquibaseUrl      := "jdbc:mysql://209.148.94.217:3306/Gara"

