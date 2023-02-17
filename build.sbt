scalaVersion := "3.2.2"

libraryDependencies ++= Seq(
  // Syncronous JDBC Modules
  "io.getquill" %% "quill-jdbc" % "4.6.0.1",
  // Or ZIO Modules
  "io.getquill" %% "quill-jdbc-zio" % "4.6.0.1",
  // Or Postgres Async
  "io.getquill" %% "quill-jasync-postgres" % "4.6.0.1",
  // Or Cassandra
  "io.getquill" %% "quill-cassandra" % "4.6.0.1",
  // Or Cassandra + ZIO
  "io.getquill" %% "quill-cassandra-zio" % "4.6.0.1",
  // Add for Caliban Integration
  "io.getquill" %% "quill-caliban" % "4.6.0.1",
  "org.postgresql" % "postgresql" % "42.5.4",
  "ch.qos.logback" % "logback-classic" % "1.4.5"
)
