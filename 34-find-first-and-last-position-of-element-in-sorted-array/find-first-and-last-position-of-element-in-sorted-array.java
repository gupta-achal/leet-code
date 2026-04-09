class Solution {
    public int[] searchRange(int[] nums, int target) {
        int li=0, hi=nums.length-1;
        int f = floor(nums,li,hi,target);
        int c = ceil(nums,li,hi,target);
        if(f == -1){
            return new int[]{-1,-1};
        }
        return new int[]{f,c};
    }
    private static int floor(int[] arr, int li, int hi, int k){

        while(li<=hi){
            int mid = li + (hi-li)/2;
            if(arr[mid] >= k){
                hi = mid-1;
            }else{
                li = mid+1;
            }
        }

        if(li == arr.length || arr[li] != k){
            return -1;
        }

        return li;
    }
    private static int ceil(int[] arr, int li, int hi, int k){

        while(li<=hi){
            int mid = li + (hi-li)/2;
            if(arr[mid] >k){
                hi = mid-1;
            }else{
                li = mid+1;
            }
        }
        return li-1;
    }
}