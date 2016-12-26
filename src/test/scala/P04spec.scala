import org.scalatest.{FlatSpec, Matchers}

class P04spec extends FlatSpec with Matchers {
  val p04 = new P04[Int]()

  "P04" should "count elements of a list" in {
    p04.length(List(1, 1, 2, 3, 5, 8)) should be (6)
    p04.length(List()) should be (0)
    p04.length(List(3)) should be (1)
  }
}
