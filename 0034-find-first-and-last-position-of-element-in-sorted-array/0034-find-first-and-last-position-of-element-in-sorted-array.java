class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c = 0;
//         int arr[] = new int[2];
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==target)
//             {
//                 if(c==0)
//                 arr[0] = i;
//                 else
//                 arr[1] = i;
//                 c++;
//             }
//         }
        
//         if(c==0)
//         {
//            arr[0] = -1;
//            arr[1] = -1;
//         }

//         if(c==1)
//         arr[1] = arr[0];
        
       

        
//         return arr;
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int x:nums)
                a.add(x);
        int x = a.lastIndexOf(target);
        int y = a.indexOf(target);
        
        return new int[] {y,x};
    }
}