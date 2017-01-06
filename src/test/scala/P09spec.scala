import org.scalatest.{FlatSpec, Matchers}

class P09spec extends FlatSpec with Matchers {
  val p09 = new P09()

  "P09" should "pack consecutive duplicates of list elements into sublists" in {
    p09.pack(List('a, 'a)) should be (List(List('a, 'a)))
    p09.pack(List('a, 'b)) should be (List(List('a), List('b)))
    p09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }
}
