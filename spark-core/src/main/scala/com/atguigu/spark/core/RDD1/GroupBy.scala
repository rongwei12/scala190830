package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object GroupBy {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("GroupBy")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20,11)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)
    //todo groupBy
    val rdd2 = rdd1.groupBy(x => x%2)

    rdd2.collect.foreach(println)
    sc.stop()
  }

}
