class Solution {
    public int firstUniqChar(String s) {
        int count=0,i=0,ans=0;
        // try in boolean
        for( i=0;i<s.length();i++){
            count=0;
            for(int j=0;j<s.length();j++){    
                if(j==i) continue;
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    //break the statement here bcs if it equals then it need to check with next further elements in j loop. we got that is repeated
                    break;
                  
                }
                }
            if(count==0) return i;
             }
        
        return -1;
    }
}