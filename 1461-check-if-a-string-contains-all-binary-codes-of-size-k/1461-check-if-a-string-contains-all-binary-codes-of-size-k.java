class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        if(s.length()<k)
            return false;
        HashSet<String> hs = new HashSet<String>();

        for(int i=0;i<=s.length()-k;i++)
        {
            hs.add(s.substring(i,i+k));
        }
        return hs.size()==Math.pow(2,k);
    }
}