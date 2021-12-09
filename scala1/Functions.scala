package exercise1
object Functions {

  //a) Напишите функцию, которая рассчитывает площадь окружности
  val okr_F = (r:Double) => Math.pow(r,2) * Math.PI

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = okr_F(r)

  // b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
  def testRectangle(a: Double) (b: Double): Double = a * b

  def testRectangleCurried(a: Double, b: Double): Double = testRectangle(a)(b)

  // c) Напишите не карированную функцию для расчета площади прямоугольника
  def testRectangleUc(a: Double, b: Double): Double = a * b

  def testRectangleCurriedUc(a: Double, b: Double): Double = testRectangleUc (a, b)

  //def main(args: Array[String]): Unit = {
   // println(testCircle(8))
   // println(testRectangle(5)(5))
   // println(testRectangleCurried(5, 5))
   // println(testRectangleUc(4, 5))
   // println(testRectangleCurriedUc(4, 5))
  //}
}




