package exercise1

import exercise1.Functions.{ testCircle, testRectangle, testRectangleCurried, testRectangleUc, testRectangleCurriedUc}
import exercise1.HigherOrder.{multiply, plus,nTimes, testNTimes, testAnonymousNTimes}
import exercise1.PatternMatching.{testIntToString, testIsMaxAndMoritz, testIsEven, testWinsA, testExtractMammalWeight, testUpdateFood, Paper, Scissor, Mammal, Meat, Plants, Fish, Bird}

object MainObject {
  def main(args: Array[String]): Unit = {


    println(testCircle(8))
    println(testRectangle(5)(5))
    println(testRectangleCurried(5, 5))
    println(testRectangleUc(4, 5))
    println(testRectangleCurriedUc(4, 5))


    println(testNTimes(plus, 2, 3, 2))
    println(testNTimes(multiply, 2, 3, 2))
    println(testAnonymousNTimes(4, 3, 2))
    println("Patterns")
    println(testIntToString(1))
    println(testIntToString(3))
    println(testIntToString(10))

    println(testIsMaxAndMoritz("Max"))
    println(testIsMaxAndMoritz("moritz"))
    println(testIsMaxAndMoritz("Maximus"))

    println(testIsEven(1))
    println(testIsEven(8))

    println(testWinsA(Paper, Scissor))

    println(testExtractMammalWeight(Mammal("Mam", Meat, 10)))

    println(testUpdateFood(Fish("KillerFish", Meat)))
  }
}
