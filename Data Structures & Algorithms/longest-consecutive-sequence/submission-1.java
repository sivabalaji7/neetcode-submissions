class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums){ 
            h.add(num);
        }
        int count=1,seq=0;
        int cur;
        for(int it:h){
            if(!h.contains(it-1)){
                count=1;
                cur=it;
                while(h.contains(cur+1)){
                    count++;
                    cur=cur+1;
                }
            }
            if(count>seq){seq=count;}
        }
        return seq;
    }
}
