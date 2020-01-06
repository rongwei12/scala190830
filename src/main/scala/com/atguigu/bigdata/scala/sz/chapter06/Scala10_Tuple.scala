package com.atguigu.bigdata.scala.sz.chapter06


object Scala10_Tuple {
  def main(args: Array[String]): Unit = {
    //todo 特殊数据存储结构：Tuple:元组 =>无关数据元素的组合
    //(1,ttt,zllsdd,20)

    val tuple= (1, "ttt", "zllsdd",34,23,43,4,35,5,4)
    //元组数据需要通过顺序号来访问其中的数据
    //Scala元组中元素的数量最多只能放22个
    // 顺序号访问
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    println(tuple._5)
    println(tuple)
    //迭代器访问
   /* val iterator = tuple.productIterator
    while( iterator.hasNext){
      println(iterator.next())
    }*/
    //索引访问
    println(tuple.productElement(9))

    //引入
    //username:zhangsan,age:20,email:xxxx
    //username:lisi,age:30,email:yyyy
    val user10 = new User100()
    user10.username="zhangsan"
    user10.age = 20
    user10.email = "xxxx"
    val idList: List[Int] = List(1, 2, 3, 4, 5, 6)
  }
}

class User100 {
  var username: String = _
  var age: Int = _
  var email: String = _
}