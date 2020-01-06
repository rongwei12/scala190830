package com.atguigu.spark.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Hello {
  def main(args: Array[String]): Unit = {

    //1.创建SparkContext(如果在Linux通过spark-submit提交，一定要去掉setMaster
    val conf: SparkConf = new SparkConf().setAppName("Hello")
    //val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Hello")
    val sc = new SparkContext(conf)
    //2.创建RDD
    val rdd1: RDD[String] = sc.textFile("hdfs://hadoop102:9000/input")
    //val rdd1: RDD[String] = sc.textFile("E:/2019_08_30/input/a.txt")
    //3.对RDD各种转换操作
    val wordAndCount: RDD[(String, Int)] = rdd1.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _)
    //    //4.执行一个行动算子
    val result: Array[(String, Int)] = wordAndCount.collect()

    result.foreach(println)

    //5.关闭SparkContext
    sc.stop()


  }

}
