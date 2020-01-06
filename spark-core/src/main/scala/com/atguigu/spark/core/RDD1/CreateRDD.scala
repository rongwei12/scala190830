package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object CreateRDD {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("CreateRDD")
    val sc = new SparkContext(conf)
    val arr1: Array[Int] = Array(30, 50, 70, 60, 10, 20)
    //val rdd1: RDD[Int] = sc.parallelize(arr1)
    //val rdd1: RDD[Int] = sc.makeRDD(arr1)
    val rdd1: RDD[Char] = sc.makeRDD("hello")
    rdd1.collect().foreach(println)

    sc.stop()
    /*RDD编程
          1.先得到一个RDD
                ①从文件中获取
                    sc.textFile("")
                ②从现有的scala集合来获取一个RDD
                ③通过其他的RDD转换得到（transformation）
          2.对RDD做各种转换
            workcount：
                        .flatMap.map.reduceByKey...
          3.有一个action
     */
  }

}
