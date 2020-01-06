package com.atguigu.bigdata.scala.sz.chapter05

object Scala16_Object9 {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - apply

        // 使用new构建对象时，等同于调用类的构造方法
        val user = new User16()
        // Scala中还可以使用伴生对象的apply方法来直接构建类对象
        //val user1 = User16.apply()
        // Scala可以自动识别伴生对象的apply方法，所以apply方法可以省略
        //val user1 = User16()
        // apply方法不能省略参数列表的小括号，否则会导致使用有问题
        //val user1 = User16( "wangwu" )

        val user2 = User16("2019-01-01")

        println(user2)

        //new Range(1,5, 2)
//        for (i <- Range(1,5, 2)) {
//
//        }
        List(1,2,3,4)
    }
}
class User16(age:Int=13) {
    println(age)
}
// Scala
object User16 {
    def apply(): User16 = new User16()
    def apply(age:Int): User16 = new User16(age)
    def apply(date:String) = {
//        "1233"
        import _root_.java.text.SimpleDateFormat
        val sdf = new SimpleDateFormat("yyyy-MM-dd")
//        new Date()
        sdf.parse(date)
    }
}