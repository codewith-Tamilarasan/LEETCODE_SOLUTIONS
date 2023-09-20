class Solution {
    public int findDuplicate(int[] nums) {
        
    //    Set<Integer> set = new HashSet<Integer>();
    //    for(int i:nums)
    //    {
    //        if(set.contains(i))
    //         return i;

    //      set.add(i);
    //    }
      boolean [] a=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
         if(a[nums[i]]) return nums[i];

         a[nums[i]]=true;   
        }
        return -1;
    
    }
}