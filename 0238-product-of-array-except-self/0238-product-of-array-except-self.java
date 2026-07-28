class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int pref=1;
        for(int i =0;i<nums.length;i++){
            prefix[i]=pref;
            pref*=nums[i];
        }
        int suf=1;
        for(int i= nums.length-1;i>=0;i--){
                prefix[i]*=suf;
                suf*=nums[i];

        }
        return prefix;
    }
}