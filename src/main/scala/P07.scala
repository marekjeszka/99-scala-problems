class P07 {

  def flatten(elems: List[Any]): List[Any] = {
    elems.flatMap {
      case l: List[_] => flatten(l)
      case i => List(i)
    }
  }
}
