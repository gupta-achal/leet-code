class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        reverse(nums1,0,m+n-1);
        reverse(nums1,n,m+n-1);

        for(int x: nums1){
            System.out.print(x+" ");
        }

        int i = n;
        int j=0;
        int k=0;
        while(i < m+n && j<n){
            if(nums1[i] <= nums2[j]){
                nums1[k] = nums1[i];
                i++;
                k++;
            }else{
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(j<n){
            nums1[k] = nums2[j];
            k++;
            j++;
        }

    }
    private static void reverse(int[] num, int l, int r){
        while(l<=r){
            int t = num[l];
            num[l] = num[r];
            num[r] = t;
            l++;
            r--;
        }
    }
}