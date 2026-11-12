class Solution {
    public int firstMissingPositive(int[] nums) {
        int least=1;
        int[] freq=new int[nums.length+1];
        freq[0]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0&&nums[i]<=nums.length){
                freq[nums[i]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return i;
            }
        }
        return freq.length;
    }
}