class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) z++;
            if(nums[i]==1) o++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<z) nums[i]=0;
            else if(i<z+o) nums[i]=1;
            else nums[i]=2;
        }
    }
}