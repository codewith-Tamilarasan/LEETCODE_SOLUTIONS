class Solution {
    public int findMiddleIndex(int[] nums) {


        for(int i=0;i<nums.length;i++)
        {
            int sum1 = 0,sum2=0;
            for(int j=i-1;j>=0;j--)
            {
                sum1+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++)
            {
                sum2+=nums[j];
            }
            if(sum1==sum2)
                return i;
            System.out.println(sum1+" "+sum2);
        }
        return -1;
  
    }
}