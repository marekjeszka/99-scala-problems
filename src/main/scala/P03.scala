class P03[A] {
  def nth(i: Int, elems: List[A]): Option[A] = {
    (i, elems) match {
      case (0, l :: _) => Some(elems.head)
      case (n, _ :: tail) => nth(n-1, tail)
      case (_, Nil) => None
    }
  }
}
