name := "SimpleSpark"

version := "0.1"

scalaVersion := "2.11.11"
val sparkCoreVersion = "2.3.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkCoreVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkCoreVersion
libraryDependencies += "com.aamend.spark" % "spark-gdelt" % "2.0"