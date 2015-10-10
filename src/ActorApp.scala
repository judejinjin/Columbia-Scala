

/**
 * @author jin_x_000
 */
import akka.actor.{Actor , ActorSystem , Props}

class HelloActor extends Actor { 
  def receive = { 
    case "ping" => { 
      println(self.path.name); Thread.sleep(0); println("pong")
    } 
    case _ => {
      println(self.path.name); Thread.sleep(0); println("huh?") 
   } 
  } 
}


object HelloActor { 
  def main(args: Array[String]) = {
    val system = ActorSystem("HelloSystem") 
    val actor1  = system.actorOf(Props(new HelloActor), name = "actor1") 
    val actor2  = system.actorOf(Props(new HelloActor), name = "actor2") 
    
    actor1 ! "ping" 
    actor1 ! "ping" 
    actor2 ! "test" 
  }
}



