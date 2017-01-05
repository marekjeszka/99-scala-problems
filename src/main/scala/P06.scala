class P06[T] {
  def isPalindrome(elems: Seq[T]): Boolean = {
    val diff = if (elems.length % 2 == 0) 0 else 1
    elems.take(elems.length / 2).reverse equals elems.slice(elems.length / 2 + diff, elems.length)
  }
}
