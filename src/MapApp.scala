/**
 * @author jin_x_000
 */

import scala.collection.immutable.{Map,HashMap}

object MapApp{
  

val fruit_to_color: Map[String, String] = Map("banana"->"yellow", 
                                              "blueberry"->"blue" ,
                                              "cherry" ->"red" ,
                                              "lemon" ->"yellow" ,
                                              "kiwi" ->"green" )
/*
def reverse[A,B](map: Map[A,B]): Map[B, List[A]] = {
        val result = new HashMap[B, List[A]]
        for ((k,v) <- map) result.put(v, 
            result get v match{ // Returns an Option[List[A]]
                case Some(l) => k :: l 
                case None => List(k) 
            })
        result
}
*/
                                              
def reverse[A,B](map: Map[A,B]): Map[B, List[A]] = 
    map.groupBy({case (a,b) =>b }).mapValues(_.keys.toList)


 def main(args: Array[String]) = {
  var result = reverse(fruit_to_color)
  println(fruit_to_color)
  println(result)

  
  println(fruit_to_color.groupBy({case(a,b)=>b}))
  
   println(fruit_to_color.groupBy({case(a,b)=>a}))
   
   println(fruit_to_color.groupBy({case(a,b)=>a}).mapValues(_.keys.toList))
   
   var move = List("E", "S", "W", "N")(0)
   
   println(move)
  }

}
