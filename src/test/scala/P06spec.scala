import org.scalatest.{FlatSpec, Matchers}

class P06spec extends FlatSpec with Matchers {
  val p06 = new P06[Int]()

  "P06" should "find out whether a list is a palindrome" in {
    p06.isPalindrome(List(1,2,3,2,1)) should be (true)
    p06.isPalindrome(List(11)) should be (true)
    p06.isPalindrome(List(1, 2, 2, 1)) should be (true)
    p06.isPalindrome(List(1, 2, 3, 1)) should be (false)
  }
}
