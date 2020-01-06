package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object FlatMap {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("FlatMap")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20,100)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)
    //得到一个新的rdd，rdd存储的是这个数和他们的平方，立方
    //val rdd2: RDD[Int] = rdd1.flatMap(x => Array(x, x * x, x * x * x))

    //val rdd2: RDD[Int] = rdd1.flatMap(x => if (x > 50) Array(x) else Array[Int]())
    //val rdd2: RDD[Char] = rdd1.flatMap(x => x + "")
    //val rdd2 = rdd1.flatMap(x => Array(x + ""))
    val rdd2 = rdd1.flatMap(x => Array(Array(x + "")))
    rdd2.collect.foreach(println)

    sc.stop()
  }

}
