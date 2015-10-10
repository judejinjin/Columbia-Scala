

/**
 * @author jin_x_000
 */
 object CallByName{

  def bob ( x : => Int ): Int = { println ( " Bob " ); x + 1 }

  def joe ( x : => Int , y : => Int ): Int = {
    println ( " Joe " );
    var a = x
    var b = y
    println ( "joe:" + (a + b) );
    a + b
  }
  def ron ( x : => Int , y : => Int , z : => Int ) {
    println ( " Ron " )
    var a = x
    var b = y
    println ( "ron:" + (a + b) )
    println ( "ron:" + (a + b + z) )
  }
 

 
  def buggy ( x : => Int ): Int = {
    println ( x );
    buggy ( x - 1)
  }

  def foo ( x : => Int , y : => Int ): Int = {
    println ( x )
    x + 2
  }

    def main(args: Array[String]) = {
       
      ron ( bob ( joe ( bob (1) ,2)) ,3 ,4)
    
      println("buggy:")
      println ( foo (1 , buggy (10)))
      //println(buggy(10))
   }
 
 }
 
  