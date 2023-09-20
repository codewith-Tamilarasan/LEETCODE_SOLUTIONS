class Solution {
    public String frequencySort(String s) {


        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault((s.charAt(i)),0)+1);
        }
       
        ArrayList<Character> output  = new ArrayList<Character>();
        String out ="";
        while(hm.size()>0)
        {
            int max = Integer.MIN_VALUE;
            char key='\0';
            for(Map.Entry<Character,Integer> x: hm.entrySet())
            {
                if(x.getValue()>max)
                {
                    max = x.getValue();
                    key = x.getKey();
                }
            }
            for(int i=0;i<max;i++)
                out+=key;
            hm.remove(key);

        }

        return out;
} 
    
}