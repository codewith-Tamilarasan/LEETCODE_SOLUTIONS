/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int start = 0,end = n;
        int mid = 0;
        while(start<=end)
        {
            mid = start + (end-start)/2;

            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)
              return mid;
            else if(isBadVersion(mid)==false)
                start = mid+1;
            else 
                end = mid;
        }

        return -1;
    }
}