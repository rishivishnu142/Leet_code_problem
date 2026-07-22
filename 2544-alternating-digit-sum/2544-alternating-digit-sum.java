class Solution {
    public int alternateDigitSum(int n) {
        int arr[]= new int[10];
         int size = 0 ;
         while(n > 0){
            arr[size] = n % 10;
            size ++ ;
            n = n / 10;
         }

         int sum = 0;
         int sign= 1 ;
         for(int i = size - 1 ;i >=0 ; i --){
            sum = sum + sign * arr[i];
            sign = sign * -1;
         }

         return sum;

}

}