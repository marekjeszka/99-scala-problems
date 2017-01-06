import org.scalatest.{FlatSpec, Matchers}

class P08spec extends FlatSpec with Matchers {
  val p08 = new P08()

  "P08" should "eliminate consecutive duplicates of list elements" in {
    p08.compress(List('a, 'b, 'c)) should be (List('a, 'b, 'c))
    p08.compress(List('a, 'a, 'a)) should be (List('a))
    p08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List('a, 'b, 'c, 'a, 'd, 'e))
    p08.compress(List('a)) should be (List('a))
  }
}
