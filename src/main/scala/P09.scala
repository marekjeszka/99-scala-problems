class P09 {
  def pack(elems: List[Symbol]): List[List[Symbol]] = {
    if (elems.isEmpty) List(List())
    else {
      val (heads, tails): (List[Symbol], List[Symbol]) = elems.span(_ == elems.head)
      tails match {
        case Nil => List(heads)
        case l => heads :: pack(l)
      }
    }
  }
}
