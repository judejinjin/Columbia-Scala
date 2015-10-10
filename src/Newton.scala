

/**
 * @author jin_x_000
 */
object Newton {
  def abs(x:Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
   if (isGoodEnough(guess, x)) guess
   else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) = abs(guess * guess - x)/x < 1e-10

  def improve(guess: Double, x: Double) =
   (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)
  
    def main(args: Array[String]) = {
       println(sqrt(1e-30))
       println(sqrt(1e-6)*sqrt(1e-6))
   }
}