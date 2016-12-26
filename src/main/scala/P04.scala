class P04[A] {
  def length(elems: List[A]): Int = {
    def recur(i: Int, elems: List[A]): Int = {
      elems match {
        case Nil => i
        case _ :: tail => recur(i+1, tail)
      }
    }
    recur(0, elems)
  }

}
