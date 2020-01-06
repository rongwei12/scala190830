package com.atguigu.bigdata.scala.sz.charter09

object Scala03_Transform2 {

    def main(args: Array[String]): Unit = {

        // 隐式转换可以进行类型的转换 : A => B
        // 如果函数使用implicit关键字，那么这个函数称之为隐式函数
        // 隐式转换参数只有一个。函数柯里化
        implicit def test( i:Double ): Int = {
            i.toInt
        }
    
        // 隐式转换的规则不能出现多次，否则会出现错误
//        implicit def test1( i:Double ): Int = {
//            i.toInt
//        }
        
        val i : Int = 2.0
        
        println(i)
    }

}
