class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int maxglobalSum=0;
        int minglobalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int currentSum=nums[0], globalSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(currentSum +nums[i],nums[i]);
            globalSum=Math.max(globalSum,currentSum);
        }
         
         maxglobalSum=globalSum;
           int currentmin=nums[0], globalmin=nums[0];

          for(int i=1;i<nums.length;i++){
            currentmin=Math.min(currentmin +nums[i],nums[i]);
            globalmin=Math.min(globalmin,currentmin);
        }
         
         minglobalSum=globalmin;

         if(maxglobalSum <0){
            return maxglobalSum;
         }

         return Math.max (maxglobalSum,totalSum - minglobalSum);

    }
}