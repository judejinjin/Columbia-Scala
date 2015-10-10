

/**
 * @author jin_x_000
 */

 /**
 * Fall 2014 CS3101-2 - Programming Languages: Scala
 * Problem Set 1, Part 1
 * 
 * Using the function collatz, write a function longest collatz, that takes an 
 * integer n as its parameter and return the positive integer m, m <= n for 
 * which collatz needs the largest number of steps. Add your function to the 
 * file Collatz.scala.
 *
 * Answer the following questions as comments at the end of Collatz.scala:
 *
 *   - Which number m, m <= 1000, produces the longest Collatz sequence? How 
 *     many steps are in this sequence?
 *   - For very large n (e.g. n = 1, 000, 000) the naive implementation of 
 *     longest collatz becomes very slow. Explain why. Describe (in words) 
 *     how you could improve the function to terminate faster (you do not
 *     have to implement a better solution at this point. The naive one
 *     is fine).
 */
class Collatz
{
  
def collatz_while(n_param : Long) : Long = {
  var count = 0 
  var n : Long = n_param 
  while (n != 1) { 
    count += 1 
    if (n % 2 == 0) n = n / 2 
    else n = 3 * n + 1 
  } 
  count 
}

/*
  
def collatz_rec(n: Int, counter: Int) : Int = 
{
    if (n == 1) 
        counter 
    else if (n % 2 == 0) 
        collatz_rec(n / 2, counter + 1)
    else 
        collatz_rec(n * 3 + 1, counter + 1)
}
*/

def collatz(n:Long) : Long = collatz_while(n)


def collatz_rec(n : Long) : Long = {
 
  if (n == 1) 0 
  else if (n % 2 == 0) 
    1 + collatz_rec(n / 2) 
  else 
    1 + collatz_rec(3 * n + 1)
}

// Your code here
def longest_collatz(n : Long) = 
{
  
    var maxSteps : Long = 0
    var steps : Long = 0
    var whichOne : Long = 0
    var x : Long = 1
    
    var progress : Double = 0.01
    
    while (x <= n)
      
    {
      steps = collatz(x);
      
      if(steps > maxSteps){
        maxSteps = steps
        whichOne = x   
      }  
      
      x += 1;
      
      if( x % (n/100) == 0) println((100*x)/n)
    }

    println(whichOne + ":" + maxSteps);
}

def longest_collatz_fun(n : Int) = 
{
   
    val  results =  (1 to n).map(x=>(x, collatz(x))).reduceLeft((x,y) => if(x._2 > y._2) x else y )
    
    println( results._1 + " has the Max Stesp: " + results._2)
 
}

}

object CollatzApp {
  def main(args: Array[String]) = {
     var app : Collatz = new Collatz(); 
     app.longest_collatz(10000) 
  }
}