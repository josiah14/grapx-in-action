name := """hello-spark"""

version := "1.0"

scalaVersion := "2.10.6"

// Testing dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "com.holdenkarau" %% "spark-testing-base" % "1.3.0_0.3.1"
)

// Production frameworks
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.3.0",
  "org.apache.spark" %% "spark-graphx" % "1.3.0"
)
