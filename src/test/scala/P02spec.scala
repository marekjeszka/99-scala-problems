import org.scalatest.{FlatSpec, Matchers}

class P02spec extends FlatSpec with Matchers {
  val p02 = new P02[Int]()

  "P02" should "find the last but one element of a list" in {
    p02.penultimate(List(1, 1, 2, 3, 5, 8)) should be (Some(5))
    p02.penultimate(List(5, 3, 8)) should be (Some(3))
    p02.penultimate(List(5, 8)) should be (Some(5))
    p02.penultimate(List(8)) should be (None)
    p02.penultimate(List()) should be (None)
  }

}
