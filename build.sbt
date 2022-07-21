scalaVersion := "3.1.3"

libraryDependencies ++= Seq(
  // Syncronous JDBC Modules
  "io.getquill" %% "quill-jdbc" % "4.1.0-V2",
  // Or ZIO Modules
  "io.getquill" %% "quill-jdbc-zio" % "4.1.0-V2",
  // Or Postgres Async
  "io.getquill" %% "quill-jasync-postgres" % "4.1.0-V2",
  // Or Cassandra
  "io.getquill" %% "quill-cassandra" % "4.1.0-V2",
  // Or Cassandra + ZIO
  "io.getquill" %% "quill-cassandra-zio" % "4.1.0-V2",
  // Add for Caliban Integration
  "io.getquill" %% "quill-caliban" % "3.19.0",
  "org.postgresql" % "postgresql" % "42.2.8",
)
