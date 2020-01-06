package com.atguigu.spark.core.RDD1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Distinct2 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("Distinct2")
    val sc: SparkContext = new SparkContext(conf)

    val list = List(new User(10, "b"), new User(10, "a"),new User(15, "c"), new User(15, "d"))
    val ord: Ordering[User] = new Ordering[User]() {
      override def compare(x: User, y: User): Int = x.age - y.age
    }
    val rdd2: RDD[User] = sc.parallelize(list).distinct
    rdd2.collect.foreach(println)
    sc.stop()
  }
}
case class User( age:Int, name:String){
  override def hashCode(): Int = age

  override def equals(obj: Any): Boolean = {
    obj match {
      case User(age,name) => this.age == age
    }
  }
}
/*
1.先看hashcode
2.再看是否为同一个对象
3.然后再看equals
 */