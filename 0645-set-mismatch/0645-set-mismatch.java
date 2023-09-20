class Solution {
    public int[] findErrorNums(int[] nums) {
        // Arrays.sort(nums);
        // int dup[] = new int[nums.length];
        // int arr[] = new int[2];
        // Set<Integer> set = new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     dup[i] = i+1;
        //     if(dup[i]!=nums[i] && (!set.contains(dup[i])))
        //     {
               
        //         arr[1] = dup[i];
               
        //     }
        //     if(set.contains(nums[i]))
        //     {
               
        //         arr[0] = nums[i];
               
        //     }
        //     set.add(nums[i]);
        // }
        // return arr;

        int[] res = new int[2];
        int[] count = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++)	count[nums[i]]++;
            for (int i = 1; i < count.length; i++) {
                if (count[i] == 2)  res[0] = i;
                if (count[i] == 0)  res[1] = i;
            }
	    return res;
    }
}