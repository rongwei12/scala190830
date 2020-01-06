package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object MapPartitions {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("MapPartitions")
    val sc:SparkContext = new SparkContext(conf)
    val list1 = List(30, 50, 70, 60, 10, 20,100,200)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)

    val resultRDD1 = rdd1.mapPartitions(it => it.map(x => x * x))
    /*val resultRDD: RDD[Unit] = rdd1.map(x => {
      //建立到mysql的连接
      //从mysql读数据
    })*/
    val resultRDD: RDD[(Int, Int)] = rdd1.mapPartitionsWithIndex((index, it) => {
      it.map((index, _))
    })
    println(resultRDD.collect().mkString(", "))

    sc.stop()
  }

}
