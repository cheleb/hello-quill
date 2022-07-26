scalaVersion := "3.2.0"

libraryDependencies ++= Seq(
  // Syncronous JDBC Modules
  "io.getquill" %% "quill-jdbc" % "4.6.0",
  // Or ZIO Modules
  "io.getquill" %% "quill-jdbc-zio" % "4.6.0",
  // Or Postgres Async
  "io.getquill" %% "quill-jasync-postgres" % "4.6.0",
  // Or Cassandra
  "io.getquill" %% "quill-cassandra" % "4.6.0",
  // Or Cassandra + ZIO
  "io.getquill" %% "quill-cassandra-zio" % "4.6.0",
  // Add for Caliban Integration
  "io.getquill" %% "quill-caliban" % "3.19.0",
  "org.postgresql" % "postgresql" % "42.2.8",
  "ch.qos.logback" % "logback-classic" % "1.2.11"
)
