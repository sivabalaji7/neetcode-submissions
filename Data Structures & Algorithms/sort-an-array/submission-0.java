class Solution {
    public int[] merge(int[] left,int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0,j=0,k=0;
         while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public int[] sortArray(int[] nums) {
        if(nums==null||nums.length<=1) return nums;
        int mid=nums.length/2;
        int[] left,right;
        left=Arrays.copyOfRange(nums,0,mid);
        right=Arrays.copyOfRange(nums,mid,nums.length);
        left=sortArray(left);
        right=sortArray(right);

        return merge(left,right);
    }
}