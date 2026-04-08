class Solution {
    public int search(int[] arr, int target) {
        int li=0;
        int hi=arr.length-1;

        while(li<=hi){
            int mid = (li + hi)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                hi = mid-1;
            }else{
                li = mid+1;
            }
        }
        return -1;
    }
}