class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int item:nums){
            if(h.containsKey(item)){
                h.put(item,h.get(item)+1);
                continue;
            }
            h.put(item,1);
        }
        int length=nums.length/3;
        for(Map.Entry<Integer,Integer> entry:h.entrySet())
        {
            if((entry.getValue())>length){
                l.add(entry.getKey());
            }
        }
        return l;
    }
}