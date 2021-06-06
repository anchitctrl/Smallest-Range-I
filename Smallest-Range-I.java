class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        int res=(max-k)-(min+k);
        if(res<0) return 0;
        return res;
    }
}
