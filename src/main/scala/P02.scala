class P02[A] {
  def penultimate(elems: List[A]): Option[A] = {
    elems match {
      case l @ (head :: _ :: Nil) => Some(head)
//      case head :: _ :: Nil => Some(head)
      case head :: tail => penultimate(tail)
      case _ => None
    }
  }
}
