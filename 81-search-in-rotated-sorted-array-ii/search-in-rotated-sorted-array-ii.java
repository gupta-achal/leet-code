class Solution {
    public boolean search(int[] arr, int target) {
        int li=0;
        int hi=arr.length-1;

        if(arr[0] == target){
            return true;
        }

        while(li<=hi){
            int mid = li + (hi-li)/2;
            // check if left array is sorted.
            if(arr[mid] == target){
                return true;
            }
            if(arr[li] == arr[hi]){
                li++;
                hi--;
            }

            //cehck if left half is sorted
            else if(arr[li] <= arr[mid]){
                if(target>=arr[li] && target<=arr[mid]){
                    hi = mid-1;
                }else{
                    li = mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[hi]){
                    li = mid+1;
                }else{
                    hi = mid-1;
                }
            }

        }

        return false;
    }
}