package com.atguigu.bigdata.scala.sz.chapter06

import scala.collection.mutable

object Scala14_Method7_Test {
  def main(args: Array[String]): Unit = {

    //todo 集合 - 常用方法 - 可变map合并
    val map1 = mutable.Map(("a", 1), ("b", 2), ("c", 3))
    val map2= mutable.Map(("a", 4), ("d", 5), ("c", 6))
    /*java实现
      for( int i = 0; i < map2.size; i++){
          kv = map2.get(i)

          Map v = map1.get(kv.k)
          if(v == null) {
            map1.put(kv.k,kv.v)
          }else {
            map1.put(kv.k,kv.v + v)
          }
      }

     */
    //map1 + map2 merge
    //("a",5),("b",2),("d",5),("c",9)

    map1.foldLeft(map2)(
      (map,kv) => {
        map.update(kv._1,(map.getOrElse(kv._1,0) + kv._2))
        map
      }
    )

  }
}
