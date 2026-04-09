class Solution {
    public int searchInsert(int[] arr, int target) {
        int li=0, hi=arr.length-1;
        while(li<=hi){
            int mid = li + (hi-li)/2;
            if(arr[mid]>=target){
                hi = mid-1;
            }else{
                li = mid+1;
            }
        }return li;
    }
}