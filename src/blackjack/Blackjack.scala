package blackjack 

import scala.io.StdIn.readLine
import cards.suits._
import cards.values._
import cards.PlayingCard
import cards.deck._



object Blackjack{

    /**
     * Compute the value of a PlayingCard given a current sum of cards. 
     */
    def cardValue(card: PlayingCard, current_sum: Int): Int = {
      card.value match{
        case Jack => card.value.v + current_sum
        case Queen => card.value.v + current_sum
        case King => card.value.v + current_sum
        case Ace => if(card.value.v + current_sum > 21) 1+current_sum else card.value.v + current_sum
        case NumberValue(_) => card.value.v + current_sum
      }
    }

    def main(args: Array[String]) {
        
        val card1 = PlayingCard(Hearts, Queen)
        val card2 = PlayingCard(Diamonds, NumberValue(9))
        val card3 = PlayingCard(Spades, Ace)

        println(card1, cardValue(card1,0))
        // Should be 10 
        println(card2, cardValue(card2,10))
        // Should be 9
        println(card3, cardValue(card3,19))
        // Should be 1
        println(card3, cardValue(card3,2))
        // Should be 11
        
        // comment the cardValue examples and add game code for Part 3 here
    }

}
