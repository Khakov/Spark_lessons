package control.first

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @author Rustam Khakov
  */
object FirstControlWork {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("First Control Work")
    conf.setMaster("local[1]")

    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val rDDFile = sc.textFile("data/superhero.csv")
    val objRDD = rDDFile.map(str => Hero.fromString(str))
    println("First:")
    objRDD.map(obj => (obj.name, 1)).reduceByKey(_ + _).foreach(res => println(res._1 + " : " + res._2))
    println("Killed Enemyes:")
    objRDD.map(obj => (obj.name, obj.killedEnemies)).reduceByKey(_ + _).foreach(res => println(res._1 + " : " + res._2))

  }
}
