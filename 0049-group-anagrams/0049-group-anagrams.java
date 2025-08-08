class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana=new HashMap<>();
        for(String word:strs)
        {
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!ana.containsKey(key))
            {
                ana.put(key,new ArrayList<>());
            }
            ana.get(key).add(word);
        }
        return new ArrayList<>(ana.values());
    }
}