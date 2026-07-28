class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxglobalSum=0;
        int minglobalSum=0;
        
      
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
    

  return Math.max(Math.abs(maxglobalSum), Math.abs(minglobalSum));
    
    }

}