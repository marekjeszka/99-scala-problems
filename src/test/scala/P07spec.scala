import org.scalatest.{FlatSpec, Matchers}

class P07spec extends FlatSpec with Matchers {
  val p07 = new P07()

  "P07" should "flatten a nested list structure" in {
    p07.flatten(List(1,2,3)) should be (List(1,2,3))
    p07.flatten(List(1)) should be (List(1))
    p07.flatten(List(List(1), 2)) should be (List(1, 2))
    p07.flatten(List(List(1, 1), 2)) should be (List(1, 1, 2))
    p07.flatten(List(List(1, List(1, 3, 4)), 2)) should be (List(1, 1, 3, 4, 2))
  }
}
