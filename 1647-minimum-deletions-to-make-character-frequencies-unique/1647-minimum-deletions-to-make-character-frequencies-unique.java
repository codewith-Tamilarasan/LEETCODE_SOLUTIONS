class Solution {
    public int minDeletions(String s) {
        int c = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), 1);
            else
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
        }
        
    
        
         Set<Integer> freqSet = new HashSet<>();

        for (int freq : hm.values()) {
            while (freq > 0 && freqSet.contains(freq)) {
                freq--;
                c++;
            }
            freqSet.add(freq);
        }
        
        
        return c;
    }
}
