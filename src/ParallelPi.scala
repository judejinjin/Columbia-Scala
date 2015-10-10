/**
 * @author jin_x_000
 */
import scala.concurrent._ 
import scala.concurrent.duration._ 
import scala.concurrent.ExecutionContext.Implicits.global

object ParallelPi {

  def calc(i: Int, nrOfElements: Int): Future[Double] = Future{
   
        val start = i *nrOfElements 
        var acc : Double = 0.0 
        var j : Long = 0
        
        println("branch "+i+" start:" + acc + " " + start + " " + (start +nrOfElements))
        for (j <- start until (start + nrOfElements)) {
            acc += 4.0 * (1 - (j % 2) * 2) / (2 * j + 1) 
         
              
             // if( (j-start) % (nrOfElements/100) == 0) println(i + ":" + j)
        }
        println("branch "+i+" done:" + acc)
        acc 
    }


  def main(args: Array[String]) = {
   
 
    val n : Int = 5
    val elements : Int = 10000
    val futures = for (i <- 0 until n) yield calc(i, elements)

    val result = Future.fold(futures)(0.0)(_+_) 
    println(result)
    
    result.onSuccess { 
      
      case pi => println("_:" + pi)

     }
    
   }

}