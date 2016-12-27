import org.scalatest.{FlatSpec, Matchers}

class P05spec extends FlatSpec with Matchers {
  val p05 = new P05[Int]()

  "P05" should "reverse a list" in {
    p05.reverse(List(1, 1, 2, 3, 5, 8)) should be (List(8, 5, 3, 2, 1, 1))
    p05.reverse(List(1)) should be (List(1))
  }
}
