package com.example

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Hello {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext(new SparkConf().setMaster("local")
                                             .setAppName("hello-spark"))

    val r = sc.makeRDD(Array("Hello", "Spark"))
    r.foreach(println(_))
    sc.stop
  }
}
