package com.atguigu.bigdata.scala.sz.charter07

object Scala04_Match3 {
  def main(args: Array[String]): Unit = {

    //todo - 模式匹配
    //val list = List((1, "zhangsan", 30),(3, "lisi", 50))
    //val ints: List[Int] = list.map(_._3)
    //println(ints.sum / ints.size)

    //模式匹配也可以应用至简原则
    /*val (id,name,age) = (1,"zhangsan",30)
    println(age)*/

    val list = List(("hello",10,0),("word",20,1),("scala",30,1))

    var sum = 0
    for( (_,count,1) <- list){
      //println(word + "=" + count)
      sum += count
    }
    println(sum)

    val map1 = Map(("a", 1), ("b", 2), ("c", 3))

    /* val result: Map[String, Int] = map1.map(
       (t) => {
         (t._1, t._2 * 2)
       })*/
    //map方法可以使用模式匹配
    //一般情况下，参数只有一个的场合可以使用模式匹配
    //使用模式匹配时需要将方法的小括号变成大括号
    //case不能省略
    /*val result= map1.map{
      case(word,count) => {
        (word, count * 2)
      }}*/

    //val filterMap: Map[String, Int] = map1.filter(_._2 > 2)
    val filterMap: Map[String, Int] = map1.filter {
      case (word, count) => {
        count > 2
      }
    }
    println(filterMap)

  }

}
