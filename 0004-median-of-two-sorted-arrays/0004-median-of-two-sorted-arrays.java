class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k1=nums1.length+nums2.length;
        int j=0;
        int mid=k1/2;
        // when creating new array it came but in old array it didnt came
        // for(i=nums1.length;i<k1;i++)
        //nums1[i]=nums2[i];
        // error occurs at i<k1 array index out of bound exceptions occured,
        int arr[]=new int[k1];
        double ans=0;
        for(int i=0;i<nums1.length;i++)
        arr[i]=nums1[i];
        for(int i=nums1.length;i<k1;i++){
         arr[i]=nums2[j++];
}
        Arrays.sort(arr);

        for(int i=0;i<k1;i++){
            if(k1%2==1){
                ans=arr[mid];
            }
            if(k1%2==0){

            ans = (long)(arr[mid]+arr[mid-1]);
			ans= ans/2;
            }
        }
           
        return  ans;
    
}
}
