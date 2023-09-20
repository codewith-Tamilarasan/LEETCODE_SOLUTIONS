class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
       
        ArrayList<Integer> output  = new ArrayList<Integer>();
        while(k!=0)
        {
            int max = Integer.MIN_VALUE;
            int z = 0;
            for(Map.Entry<Integer,Integer> x:hm.entrySet())
            {
                int y  = x.getValue();
                if(y>max)
                {
                    max = y;
                    z = x.getKey();
                }
            }
            output.add(z);
            hm.remove(z);
            k--;
        } 
        int[] ans = new int[output.size()];
        for(int i=0;i<output.size();i++)
            ans[i] = output.get(i);
        
        return ans;
    }
}