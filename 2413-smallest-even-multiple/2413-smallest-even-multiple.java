class Solution {
    public int smallestEvenMultiple(int n) {
     while(true){
        if( n% 2 == 0 && n% n ==0 ){
            return n;
        }
        return n * 2 ;
     }
     
    }
}