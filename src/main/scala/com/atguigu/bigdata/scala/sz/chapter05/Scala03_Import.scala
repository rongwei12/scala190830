package com.atguigu.bigdata.scala.sz.chapter05

//import java.util.{ArrayList,Map,List,_}
//import java.util._
//import java.sql.{Array=>_,Date => _, _}
import _root_.java.util.{HashMap=>JavaHashMap}

import scala.util.control.Breaks._

object Scala03_Import {
    def main(args: Array[String]): Unit = {
        
        // TODO 面向对象 - import
        // java : 导类
        // 1. Scala才是真正的导包
        //util.ArrayList
        // 2. Scala中导入包中所有的类使用下划线来代替星号
        // import java.util._
        // ArrayList
        // 3. import关键字可以在任意的地方声明使用
        //import java.util.Date
        //Date
        // 4. import 可以模仿java中的静态导入
        //Breaks.
        // 5. import 可以在一行中导入多个类
        // import java.util.{ArrayList,Map,List}
        // 6. 屏蔽类
        //val d = new Date()
        //println(d)
        // 7. Scala中访问包中的类使用的包路径为相对路径，默认以当前包为准
        //    如果不想使用相对路径，那么可以使用绝对路径, 使用根路径 : _root_
        //val map = new _root_.java.util.HashMap()
        //println(map)
        // 8. 给类起别名
        // import _root_.java.util.{HashMap=>JavaHashMap}
        //println(new JavaHashMap())
        //type S = String
        //new S()
    }
}
class HashMap() {

        }