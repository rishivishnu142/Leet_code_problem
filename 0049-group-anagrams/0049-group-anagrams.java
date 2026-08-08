class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> hs= new HashMap <> () ;
        for(String word:strs){
            char [] ch=word.toCharArray();
            Arrays.sort(ch);
            String Sortedword = new String(ch);
            if(!hs.containsKey(Sortedword)){
                hs.put(Sortedword,new ArrayList<>());
            }
            hs.get(Sortedword).add(word);
        }
        return new ArrayList<> (hs.values());
    }
}