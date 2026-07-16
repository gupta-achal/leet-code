class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        reverse(nums1,0,m+n-1);
        reverse(nums1,n,m+n-1);
        for(int x: nums1){
            System.out.print(x+" ");
        }
        int i = n; 
        int j = 0;
        int l1 = nums1.length-1, l2=nums2.length-1;
        int k=0;
        while(i<=l1 && j<=l2){
            if(nums1[i] <= nums2[j]){
                nums1[k] = nums1[i];
                
                k++;
                i++;
            }else{
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(j<=l2){
            nums1[k] = nums2[j];
            k++;
            j++;
        }

        
    }

    private static void reverse(int [] arr, int l, int r){
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}