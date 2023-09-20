class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=i+indexDiff;j++)
            {
            if(j<nums.length)
            {
            if((Math.abs(i-j)<=indexDiff) && (Math.abs(nums[i]-nums[j])<=valueDiff))
                return true;
            }
            }
        }
        return false;
    }
    
}

// reference code
// class Solution {
//     public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) 
//     {
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<=i+indexDiff;j++)
//             {
//                 //dont traverse the loop until last just traverse the loop until the maximum possibilty of gettiing the difference
//                 if(j<nums.length)
//                 {
//                  if(Math.abs(i-j)<=indexDiff && Math.abs(nums[i]-nums[j])<=valueDiff)
//                     {
//                        return true;
                        
//                     }
//                 }
                

//             }
//         }
//         return false;
//     }
// }