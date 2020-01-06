package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Method2 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 5, 4)
    val list1 = List(4, 5, 6, 7)
    val list2 = List(list, list1)

    //todo 映射 / 转换，将指定的数据转换为其他的数据 map(_ * 2)
    //集合的map方法会将集合的每一个元素都执行map方法中传递的逻辑
    //map方法会将每一个数据转换后的结果放置在新的集合中返回
    def transform(i: Int): String = {
      //      i * 2
      "num=" + i
    }
    //    println(list.map(transform))
    //    println(list.map((i)=>{i*2))
    //println(list.map(_ * 2))

    //todo 扁平化：将一个整体数据拆分为一个一个的个体来使用称之为扁平化 flatten
    //println(list2.flatten)
    println(list2.map(list => list.map(_ * 2)).flatten)
    //println(list2.flatten.map(_ * 2))
    //todo 扁平映射 flatMap(_.map(_ * 2))
    //flatMap等同于将map和flatten融合在一起实现功能
    //输入参数为集合中的每一个数据
    //输出的结果为扁平化后的数据集合
    //println(list2.flatMap(list => list.map(_*2)))
   // println(list2.flatMap(_.map(_ * 2)))

    //todo 过滤 filter
    //将集合中所有的数据进行逻辑判断，返回结果为true保留，如果为false就舍弃
    //println(list.filter(num => num % 2 == 0))
    val list3 = List("Spark", "Scala", "Hadoop")
    //println(list3.filter(s => s.startsWith("S")))

    //todo 分组 groupBy
    //通过指定的规则进行分组
    //指定的规则的返回值作为分组的key,数据就是分组后的Value
    println(list.groupBy(num => num % 2))
    println(list3.groupBy(s => s.substring(0, 1))) //按照首字母分组

    //todo 排序 sortBy
    //通过指定的规则进行排序
    println(list.sortBy(num => num))
    //println(list.sortBy(num => num)(Ordering.Int.reverse))
    //println(list.sortBy(num => num).reverse)
    val list4 = List("1", "2", "11", "3", "22")
    println(list4.sortBy(s => s.toInt))

    val stu1 = new Student()
    stu1.id = 1
    stu1.name = "zhangsan"
    val stu2 = new Student()
    stu2.id = 1
    stu2.name = "lisi"
    val list5 = List(stu2, stu1)
//    println(list5.sortBy(stu => stu.id + stu.name))
    //元组可以进行比较，先比较第一个，再比较第二个，依次类推
    println(list5.sortBy(stu => (stu.id, stu.name)))

    println(list5.sortWith(
      /*(stu1, stu2) => {
        if(stu1.id < stu2.id){
          true
        }else if(stu1.id == stu2.id){
          stu1.name < stu2.name
        }else{
          false
        }*/
      (stu1, stu2) => {
        if(stu1.id > stu2.id){
          true
        }else if(stu1.id == stu2.id){
          stu1.name > stu2.name
        }else{
          false
        }
      }
    ))
  }
}

class Student {
  var id: Int = _
  var name: String = _

  override def toString: String = {
    "user(" + id +" "+ name+ ")"
  }
}
