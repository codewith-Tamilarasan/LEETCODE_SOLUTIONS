class Solution {
    public void rotate(int[] nums, int k) {
        
        int  x = k%nums.length;
        int y = nums.length-x;
        int arr[] = new int[nums.length];
        int j = y;
        for(int i=nums.length-1;i>=y;i--)
            arr[j++] = nums[i];
        j=0;
        for(int i=y-1;i>=0;i--)
            arr[j++] = nums[i];
       
        j=0;
        for(int i=nums.length-1;i>=0;i--)
           nums[j++]=arr[i];
      
        
      
    }
}