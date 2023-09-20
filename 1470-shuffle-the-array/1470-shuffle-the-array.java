class Solution {
    public int[] shuffle(int[] nums, int n) {
      int j=0;
      int k=nums.length;
        int arr[]=new int[k];
        for(int i=0;i<k;i=i+2)
        {
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
      }
      return arr;
    }
}