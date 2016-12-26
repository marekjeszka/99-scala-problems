import org.scalatest.{FlatSpec, Matchers}

class P03spec extends FlatSpec with Matchers {
  val p03 = new P03[Int]()

  "P03" should "find the n-th element of a list" in {
    p03.nth(2, List(1, 1, 2, 3, 5, 8)) should be (Some(2))
    p03.nth(0, List(1, 1, 2, 3, 5, 8)) should be (Some(1))
    p03.nth(5, List(1, 1, 2, 3, 5, 8)) should be (Some(8))
    p03.nth(6, List(1, 1, 2, 3, 5, 8)) should be (None)
  }
}
