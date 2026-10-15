class Solution {
    public int removeElement(int[] nums, int val) {
        int rear=nums.length-1;
        for(int front=0;front<=rear;front++){
            while(nums[rear]==val&&rear>0) rear--;
            if(front>rear) break;
            int temp;
            if(nums[front]==val){
                temp=nums[rear];
                nums[rear]=nums[front];
                nums[front]=temp;
                rear--;
            }
        }
        return rear+1;
    }
}