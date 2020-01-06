package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Distinct {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Distinct")
    val sc: SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20, 11, 1, 2, 3, 5, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(list1, 2)
    //todo sample
    val rdd2 = rdd1.distinct()

   println(rdd2.collect.mkString(", "))
    sc.stop()
  }

}
