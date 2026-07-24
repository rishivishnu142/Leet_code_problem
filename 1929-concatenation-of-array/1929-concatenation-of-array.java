class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList <Integer> al=new ArrayList <> ();
        for(int n:nums){
            al.add(n); }
              for(int n:nums){
            al.add(n); }

        
         int[] res = new int[al.size()];
         for(int i=0;i<res.length;i++){
            res[i]=al.get(i);

         }
             return res;
    

        
    }
}