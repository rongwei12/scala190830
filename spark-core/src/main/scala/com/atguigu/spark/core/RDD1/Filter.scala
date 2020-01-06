package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Filter {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]") .setAppName("Filter")
    val sc:SparkContext = new SparkContext(conf)
    val list1: List[Int] = List(30, 50, 70, 60, 10, 20,100)
    val rdd1: RDD[Int] = sc.parallelize(list1,2)
    //todo filter
    //val rdd2: RDD[Int] = rdd1.filter(x => x > 30)
    //val rdd2: RDD[Int] = rdd1.filter(_ > 30)
    //todo collect()和spark中collect的区别
    //rdd1.filter(_ > 30).map(_ + 10)
    val rdd2 = rdd1.collect{//filter + map
      case x:Int if x>30 => x + 10
    }

    rdd2.collect.foreach(println)

    sc.stop()
  }

}
