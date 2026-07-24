class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int m:candies){
            if(m>max){
            max=m;}

        }

        
        List<Boolean> ls = new ArrayList<>();


        for(int m: candies){
            ls.add(m+extraCandies>=max);
        }

        return ls;
    }

}