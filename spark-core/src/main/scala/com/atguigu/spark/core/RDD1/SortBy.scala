package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object SortBy {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("SortBy")
    val sc: SparkContext = new SparkContext(conf)
    val list1: List[String] = List("abc", "nihao", "zhen", "jia", "nihaa", "he")
    val rdd1: RDD[String] = sc.parallelize(list1,2)

    //val rdd2: RDD[String] = rdd1.sortBy(x => x,true)
    //先按照字符串的长度升序，如果长度相等，按照字典的降序排序
    val rdd2: RDD[String] = rdd1.sortBy(x => ((x.length,x)),true)
    rdd2.collect.foreach(println)
    sc.stop()
  }

}
