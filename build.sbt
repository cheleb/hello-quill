scalaVersion := "3.7.0"

val quilVersion = "4.8.6"

libraryDependencies ++= Seq(
  // Syncronous JDBC Modules
  "io.getquill" %% "quill-jdbc" % quilVersion,
  // Or ZIO Modules
  "io.getquill" %% "quill-jdbc-zio" % quilVersion,
  // Or Postgres Async
  "io.getquill" %% "quill-jasync-postgres" % quilVersion,
  // Or Cassandra
  "io.getquill" %% "quill-cassandra" % quilVersion,
  // Or Cassandra + ZIO
  "io.getquill" %% "quill-cassandra-zio" % quilVersion,
  // Add for Caliban Integration
  "io.getquill" %% "quill-caliban" % quilVersion,
  "org.postgresql" % "postgresql" % "42.7.5",
  "ch.qos.logback" % "logback-classic" % "1.5.18"
)
