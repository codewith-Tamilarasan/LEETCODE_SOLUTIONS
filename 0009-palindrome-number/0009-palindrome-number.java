class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(x==rev)
        return true;

        return false;
    }
}