class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            int li = matrix[i][0];
            int hi = matrix[i][matrix[0].length-1];

            if(target>=li && target<=hi){
                return search(matrix[i],target);
            }
        }
        return false;
    }

    private static boolean search(int[] arr, int k){
        int li = 0;
        int hi = arr.length - 1;

        while(li <= hi){
            int mid = li + (hi-li)/2;

            if(arr[mid] == k){
                return true;
            }
            if(k<arr[mid]){
                hi = mid-1;
            }else{
                li = mid+1;;
            }
        }
        return false;
    }
}