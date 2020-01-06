package com.atguigu.bigdata.scala.sz.charter08

object Scala_Req {
    def main(args: Array[String]): Unit = {
        // TODO 不同的区域 +  商品点击（sum） + 排名(降序) +前三(3)
        val dataList = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )
        val listToTuples: List[(String, Int)] = dataList.map(s => (s._2 + "_" + s._3, 1))
        println(listToTuples)
        val TuplesToCon: Map[String, Int] = listToTuples.groupBy(s => s._1).map(s => (s._1, s._2.size))
        val ConToMap = TuplesToCon.toList.map {
            case (city, count) => {
                val keys: Array[String] = city.split("_")
                (keys(0), (keys(1), count))
            }
        }.groupBy(_._1)
        println(ConToMap)
        println(ConToMap.mapValues{
            list => {
                list.map{
                    case(kv,value) => {
                        (value._1,value._2)
                    }
                }.sortBy(s => -s._2).take(3)
            }
        })












        // TODO 将原始数据进行数据清洗（ETL）
        // （area, item）=> (area-item, 1)
//        val datas: List[(String, Int)] = dataList.map(
//            data => {
//                (data._2 +"_"+ data._3, 1)
//            }
//        )
        val datas: List[(String, Int)] = dataList.map{
            case ( name, area, item ) => {
                (area + "_" + item, 1)
            }
        }
        
        // TODO 将清洗后的数据进行分组聚合
        // (area-item, 1) ==> (area-item, sum)
        val areaItemToList: Map[String, List[(String, Int)]] = datas.groupBy(_._1)
        val areaItemToSum: Map[String, Int] = areaItemToList.map(data=>(data._1, data._2.size))
        
        // TODO 将聚合后的结果转换结构
        // (area-item, sum) => (area, (item, sum))
        val areaToItemAndSum: List[(String, (String, Int))] = areaItemToSum.toList.map {
            case (key, sum) => {
                val keys = key.split("_")
                (keys(0), (keys(1), sum))
            }
        }
        
        // TODO 将相同区域的数据放置在一起
        val areaToList: Map[String, List[(String, (String, Int))]] = areaToItemAndSum.groupBy(_._1)
    
        val resultMap: Map[String, List[(String, Int)]] = areaToList.mapValues(
            list => {
                val itemToSumList: List[(String, Int)] = list.map(_._2)
            
                itemToSumList.sortWith(
                    (left, right) => {
                        left._2 > right._2
                    }
                ).take(3)
            }
        )
        
        println(resultMap)
        
    }
}
