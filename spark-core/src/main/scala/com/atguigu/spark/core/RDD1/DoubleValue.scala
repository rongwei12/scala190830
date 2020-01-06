package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object DoubleValue {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("DoubleValue")
    val sc: SparkContext = new SparkContext(conf)
    val list1 = List(30, 50, 70, 60, 10, 2, 1, 2, 3)
    val list2 = List(3, 5, 70, 6, 1, 2)
    val rdd1: RDD[Int] = sc.parallelize(list1, 2)
    val rdd2: RDD[Int] = sc.parallelize(list2, 2)
    //todo 并交差，拉链
    //并集
    val rdd3: RDD[Int] = rdd1.union(rdd2)
    //rdd3.collect.foreach(println)
    //交集
    val rdd4: RDD[Int] = rdd1.intersection(rdd2)
    rdd4.collect.foreach(println)
    //差集：rdd1减去他们的交集
    val rdd5: RDD[Int] = rdd1.subtract(rdd2)
    rdd5.collect.foreach(println)
    /*拉链
    限制：1.分区数需相等
         2.每个分区内的元素个数相等（总数相同）
     */
    //val rdd6: RDD[(Int, Int)] = rdd1.zip(rdd2)
    //跟自己的索引进行zip
    //val rdd6: RDD[(Int, Long)] = rdd1.zipWithIndex()
    val rdd6 = rdd1.zipPartitions(rdd2)((it1: Iterator[Int], it2: Iterator[Int]) => {
      //it.zip(it2)//多余的扔掉
      it1.zipAll(it2, -1, -2) //多余的地方补默认值
    })
    rdd6.collect.foreach(println)


    sc.stop()
  }

}
