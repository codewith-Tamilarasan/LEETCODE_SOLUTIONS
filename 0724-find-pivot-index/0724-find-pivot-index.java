class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0,lsum=0;
        for(int i:nums)
        {
           tsum+=i;

        }

        for(int i=0;i<nums.length;i++)
        {
            if(lsum == tsum-lsum-nums[i])
                return i;
            lsum+=nums[i];
        }
        return -1;
    }

}