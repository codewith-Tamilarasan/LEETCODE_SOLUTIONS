class Solution {
    public int sumOfUnique(int[] nums) {
        
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
           
             if(hm.containsKey(nums[i]))    hm.put(nums[i],hm.get(nums[i])+1);

             else hm.put(nums[i],1);
            
        }
        for(Map.Entry <Integer,Integer>map:hm.entrySet()){
            if(map.getValue()==1) sum+=map.getKey();
        }
        return sum;        
    }          
}