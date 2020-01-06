package com.atguigu.bigdata.scala.sz.chapter05

object Scala23_Trait7 {
    def main(args: Array[String]): Unit = {

        val mysql = new MySQL()
        // 特质的功能叠加
        // 多个特质的初始化顺序为从左到右
        // 多个特质的方法调用执行顺序为有右到左
        // 特质中使用super关键字表示的不是上一级trait，而是上一个trait
        mysql.operData()
        
        // 向文件中操作数据......
        // 向内存中操作数据......
    }
}
trait Operate {
    def operData(): Unit = {
        println("操作数据......")
    }
}
trait Memory extends Operate {
    override def operData(): Unit = {
        print("向内存中")
        super.operData()
    }
}
trait File extends Operate {
    override def operData(): Unit = {
        print("向文件中")
        super[Operate].operData()
    }
}
// File => Memory => Operate
class MySQL extends Memory with File {

}


