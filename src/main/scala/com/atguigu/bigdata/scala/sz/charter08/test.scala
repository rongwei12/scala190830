package com.atguigu.bigdata.scala.sz.charter08

import java.sql.Date
import java.text.SimpleDateFormat

object test {

  def main(args: Array[String]): Unit = {
    val time1 = List(
      ( "anheqiao", 1549044122L, 10.0 ),
      ( "shengbeilu", 1549044122L, 32.0 ),
      ( "pinganjie", 1549044122L,25.0 )
    )
    val time2 = List(
      ( "anheqiao", 1549044123L, 13.0 ),
      ( "shengbeilu", 1549044123L, 34.0 ),
      ( "pinganjie", 1549044123L,27.0 )
    )
    val time3 = List(
      ( "anheqiao", 1549130522L, 14.0 ),
      ( "shengbeilu", 1549130522L, 33.0 ),
      ( "pinganjie", 1549130522L,26.0 )
    )
    val time4 = List(
      ( "anheqiao", 1549130523L, 11.0 ),
      ( "shengbeilu", 1549130523L, 32.0 ),
      ( "pinganjie", 1549130523L,23.0 )
    )
    //取得传感器上报数据，并统计出每一个传感器点位每天的平均水位
    //1.
    val list = List(time1, time2, time3, time3)
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val listToTuples: List[(String, Double)] = list.flatMap(list => list).map {
      case (name, dt, wm) => {
        (name + "_" + sdf.format(new Date(dt * 1000)), wm)
      }
    }
    //2.(String, Double) => (String,avg)
    val tuplesToAvg: List[(String, (String, Double))] = listToTuples.groupBy(s => s._1).toList.map {
      case (addressTime, wm) => {
        val keys: Array[String] = addressTime.split("_")
        val values: List[Double] = wm.map(_._2)
        (keys(0), (keys(1), values.sum / values.length))
      }
    }
    //3.(String, (String, Double)分组，按天求值
    println(tuplesToAvg.groupBy(s => s._1).toList.map{
      case (keys,values) => {
        (keys,values.map(_._2))
    }})


    //将原始数据进行扁平化操作，所有的数据都是独立的个体
    val watermarkList: List[(String, Long, Double)] = list.flatMap(list => list)
    //println(watermarkList)

    //todo 将扁平化后的数据进行结构的转换（String，Long，Double) => (String,String,Double)
    //val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val mapWatermarkList: List[(String, Double)] = watermarkList.map {
      case (address, ts, wm) => {
        (address + "_" + sdf.format(new Date(ts * 1000)), wm)
      }}
    //mapWatermarkList.foreach(println)
    //println(mapWatermarkList)

   /* //todo 将转换后的数据根据 地点-时间 进行分组
    val addressAndTimeToList: Map[String, List[(String, Double)]] = mapWatermarkList.groupBy(t => t._1)
    //println(addressAndTimeToList)
    //todo 将分组后的数据进行结构的转换 （String，list） => (String，(time,avg))
    val addressAndTimeToAvg = addressAndTimeToList.toList.map {
      case (addressTime, list) => {
        val keys: Array[String] = addressTime.split("_")
        val values: List[Double] = list.map(_._2)
        (keys(0), (keys(1),values.sum / values.size))
      }}
   // println(addressAndTimeToAvg)

    //todo 将转换结构后的数据根据传感器的地点进行分组
    val stringToTuples: Map[String, List[(String, (String, Double))]] = addressAndTimeToAvg.groupBy(_._1)
    stringToTuples.foreach(println)*/
  }
}