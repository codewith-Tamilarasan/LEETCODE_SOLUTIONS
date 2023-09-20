class Solution {
    public int addDigits(int n) {
        int sum =  0;
        
      
        while(n!=0)
        {
            int x = n%10;
            sum+=x;
            n =  n/10;
            if(n==0)
            {
                n = sum;
                sum = 0;
                 if(n<10)
                    break;
            }
        }
        return n;
        
    }
}