class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:nums){
            if(h.containsKey(n)){
                h.put(n,h.get(n)+1);
            }
            else h.put(n,1);
        }   
        int max=0,key=nums[0];  
        for(int n:nums){
            if(h.get(n)>max){
                max=h.get(n);
                key=n;
            }
        }  
        return key;
    }
}