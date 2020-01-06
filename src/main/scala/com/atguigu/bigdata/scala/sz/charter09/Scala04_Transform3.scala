package com.atguigu.bigdata.scala.sz.charter09

object Scala04_Transform3 {

    def main(args: Array[String]): Unit = {

        // 将方法参数的前面增加：implicit， 这个参数称之为隐式参数
        // 如果想要动态改变参数的值，需要采用隐式变量
       def regUser( implicit password : String = "123123" ): Unit = {
           println("insert user("+password+")")
       }
        
        //implicit val xxxxxx : String = "000000"
        //implicit val password1 : String = "111111"
        
        //regUser()
        // 隐式变量的使用，不能在调用函数时增加小括号
        regUser
        
//        val ints = List(1,2,4,3)
//        //println(ints.sortBy(num => num)(Ordering.Int.reverse))
//        ints.sortBy(num => num)
//        ints.sortBy(num => num)(Ordering.Int.reverse)
    }

}
