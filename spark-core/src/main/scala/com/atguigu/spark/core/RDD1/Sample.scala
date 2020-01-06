package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Sample {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("Sample")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20,11,1,2,3,5)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)
    //todo sample
    //true:放回抽样，参数2：抽取的比例 [0,无穷)
    //false:不放回抽样，参数2:抽取的比例  [0,1]
    val rdd2 = rdd1.sample(false,0.2)

    rdd2.collect.foreach(println)
    sc.stop()
  }

}
