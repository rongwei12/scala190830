package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Coalease {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("Coalease")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20)
    val rdd1: RDD[Int] = sc.parallelize(list1,3)
    //todo Coalease
    println(rdd1.getNumPartitions)
    //减少分区数，不要选择shuffle
    //增加分区数，必须选择shuffle
    //val rdd2: RDD[Int] = rdd1.coalesce(4,true)
    //todo repartition一定shuffle
    val rdd2: RDD[Int] = rdd1.repartition(4)
    println(rdd2.getNumPartitions)

    sc.stop()
  }

}
