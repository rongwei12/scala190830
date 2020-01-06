package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Glom {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("Glom")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20,100)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)
    //todo Glom
    val rdd2: RDD[Array[Int]] = rdd1.glom()

    rdd2.collect.foreach(x => println(x.mkString(",")))
    sc.stop()
  }

}
