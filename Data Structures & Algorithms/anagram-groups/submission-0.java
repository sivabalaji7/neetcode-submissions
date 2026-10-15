class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        List<String> temp;
        for(String s: strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String val=new String(ch);
            if(!h.containsKey(val)){
                temp=new ArrayList<>();
                h.put(val,temp);
            }
            h.get(val).add(s);
        }
        return new ArrayList<>(h.values());
    }
}
