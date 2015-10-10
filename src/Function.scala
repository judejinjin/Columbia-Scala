

/**
 * @author jin_x_000
 */
object Function {

  val square = ( x : Int ) => x * x
  val inc = ( x : Int ) => x + 1
  
  def compose(f:Int=>Int, g: Int=>Int) (x:Int) = f(g(x))
 
  def repeat(f:Int=>Int, x:Int) : Int=>Int = {
    if(x==1) f
    else
    compose(repeat(f, x-1), f)
  }
  
  def main(args: Array[String]) = {
      val squareinc :Int=>Int = compose(square, inc)
      println(squareinc(3))
      
      val square4 : Int=>Int = repeat(square, 4)
      println(square4(2))
  }
 
}