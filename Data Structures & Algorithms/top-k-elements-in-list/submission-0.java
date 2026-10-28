class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],0);
            }
        }
        
        List<Integer>[] bucket=new List[nums.length+1];
        for(int key: h.keySet())
        {
            int freq=h.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res=new int[k];
        int index=0;
        for(int i=nums.length;i>=0;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    res[index++]=num;
                    if(index==k) return res;
                }
            }
        }
        return res;
    }
}
