class Solution {
    public boolean isPalindrome(int x) {
        int reverse= 0;
      int num = x;
        while(num > 0 ){
            int digit =num % 10;
            reverse = reverse *10 + digit ;
            num= num/ 10 ;
        }
        if( x == reverse){
            return true;
        }
        
    return false;
    }
}