package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Map {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("Map")
    val sc:SparkContext = new SparkContext(conf)
    val arr1: Array[Int] = Array(30, 50, 70, 60, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(arr1)

    //map用的最多，调整数据结构
    val resultRDD: RDD[Int] = rdd1.map(x => x * x)//math.pow(_,2)
    println(resultRDD.collect().mkString(","))

    sc.stop()
  }

}
