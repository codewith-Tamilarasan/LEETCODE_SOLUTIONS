class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int x=0,c=0;
        if(s.length()==0)
            return true;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==s.charAt(x))
            {
            c++;
            if(c==s.length())
            return true;
            x++;
            }
        }
        return false;
        
    }
}