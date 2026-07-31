class Solution {
    public int trap(int[] arr) {
        int l=0,r=arr.length-1;
        int tcap=0;int lmax=arr[0],
        rmax=arr[arr.length-1];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,arr[l]);
                tcap+=(lmax-arr[l]);

            }
            else{
                r--;
                rmax=Math.max(rmax,arr[r]);
                tcap+=(rmax-arr[r]);

            }
        }
        return tcap ;
    }
}