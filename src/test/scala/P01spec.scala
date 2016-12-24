import org.scalatest.{FlatSpec, Matchers}

class P01spec extends FlatSpec with Matchers {

  val p01 = new P01[Int]()

  "P01" should "find last" in {
    p01.last(List(1, 1, 2, 3, 5, 8)) should be (Some(8))
    p01.last(List(2)) should be (Some(2))
    p01.last(List('A', 'B', 'C')) should be (Some('C'))
    p01.last(List()) should be (None)
  }
}
