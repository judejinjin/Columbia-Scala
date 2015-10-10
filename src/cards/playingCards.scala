package cards

package suits {
    sealed abstract class CardSuit
    case object Spades extends CardSuit
    case object Clubs extends CardSuit
    case object Diamonds extends CardSuit
    case object Hearts extends CardSuit
}

// define package values with type hierarchy for card values here 

package values{
  sealed abstract class CardValue { var v : Int }
  case object Jack extends CardValue { override var v :Int = 10 }
  case object Queen extends CardValue { override var v :Int = 10 }
  case object King extends CardValue { override var v :Int = 10 }
  case object Ace extends CardValue { override var v :Int = 11 }
  case class NumberValue(value : Int) extends CardValue { override var v :Int = value }
}

// This won't compile because values.CardValue is undefined
case class PlayingCard(suit: suits.CardSuit, value: values.CardValue)
