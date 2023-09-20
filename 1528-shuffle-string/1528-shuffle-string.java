class Solution {
    public String restoreString(String s, int[] indices) {

      String out="";

      char[] ch = new char[s.length()];

      for(int i=0;i<ch.length;i++)
      {
        ch[indices[i]] = s.charAt(i);


      }

      for(int i=0;i<ch.length;i++)
      {
        out+=ch[i];
      }


      return out;
        
    }
}