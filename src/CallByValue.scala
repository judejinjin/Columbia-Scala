

/**
 * @author jin_x_000
 */
 object CallByValue{

  def bob ( x : Int ): Int = { println ( " Bob " ); x + 1 }

  def joe ( x : Int , y : Int ): Int = {
    println ( " Joe " );
    val a = x ; val b = y ; println ( a + b );
    a + b
  }
  def ron ( x : Int , y : Int , z : Int ) {
    println ( " Ron " )
    println ( x + y )
    println ( x + y + z )
  }
 

 
  def buggy ( x : Int ): Int = {
    println ( x );
    buggy ( x - 1)
  }

  def foo ( x : Int , y : Int ): Int = {
    println ( x )
    x + 2
  }

    def main(args: Array[String]) = {
       
      ron ( bob ( joe ( bob (1) ,2)) ,3 ,4)
    
      //println("buggy:")
      //println ( foo (1 , buggy (10)))
   }
 
 }
 