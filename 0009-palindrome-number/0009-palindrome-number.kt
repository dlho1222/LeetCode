class Solution {
    fun isPalindrome(x: Int): Boolean {
        return x.sign != -1 && x.toString() == x.toString().reversed()
    }
}