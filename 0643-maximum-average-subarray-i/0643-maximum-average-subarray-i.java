class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long  globalSum=0;
        for(int i =0;i<k;i++){
            globalSum+=nums[i];
        }
        long currentSum=globalSum;
        for(int i=k;i<nums.length;i++){
            currentSum=currentSum+nums[i] - nums[i-k];

            globalSum=Math.max(globalSum,currentSum);
        }
        return(double)globalSum/k;
    }
}