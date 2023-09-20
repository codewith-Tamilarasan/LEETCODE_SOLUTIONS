
class Solution {
    public double myPow(double x, int n) {
        /*
        double sum=1.0;
        if(n>0){
        for(int i=1;i<=n;i++){
            sum*=x;

        }
        }
        if(n<0){
            for(int i=1;i<=(-n);i++){
                sum*=x;
            }
            sum=1/sum;
        }
       
        return sum;
        */
        double k = Math.pow(x,n); 
        return k;
        
       
    }
}