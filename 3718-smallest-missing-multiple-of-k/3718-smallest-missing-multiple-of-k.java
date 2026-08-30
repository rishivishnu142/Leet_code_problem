class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> hs=  new HashSet <> () ;
        for(int num:nums){
                    hs.add(num);
        }
        int i=1;
        while(true){
            if(!hs.contains(i*k)){
                return i*k;           
                 }
                 i++;
        }
    }
}