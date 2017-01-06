class P08 {
  def compressVar(elems: List[Symbol]): List[Symbol] = {
    var result: List[Symbol] = List(elems.head)
    elems.foreach(s => if(s != result.last) result = result :+ s)
    result
  }

  def compress(elems: List[Symbol]): List[Symbol] = {
    elems.foldRight(List[Symbol]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
  }
}
