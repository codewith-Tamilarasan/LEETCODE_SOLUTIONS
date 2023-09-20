class Solution {
    public int removeDuplicates(int[] nums) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
           int  c=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    c++;
            }
            if(c<2)
                a.add(nums[i]);
        }
        for(int i=0;i<a.size();i++)
            nums[i] = a.get(i);
        return a.size();
    }
}