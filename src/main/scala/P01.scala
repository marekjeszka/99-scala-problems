class P01[A] {
  def last(elems: List[A]): Option[A] = {
    elems match {
      case Nil => None
      case head :: Nil => Some(head)
      case _ => last(elems.tail)
    }
  }
}
