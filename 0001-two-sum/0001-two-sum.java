class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         int i,j,t;
         int arr[]=new int[2];
         for(i=0;i<nums.length;i++){
             for(j=i+1;j<nums.length;j++){
                 t=(nums[i]+nums[j]);
                
                 if(t==target){
                   arr[0]=i;
                   arr[1]=j;
                 }
             }
         }
         return arr;
    }
}