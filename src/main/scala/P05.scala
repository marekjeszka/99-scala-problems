class P05[A]() {
  def reverse(elems: List[A]): List[A] = {
    elems match {
      case Nil => Nil
      case head :: tail => reverse(tail) ::: List(head)
    }
  }

}
