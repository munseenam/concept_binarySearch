public class binarySearch {

    public static int binarySearchArray(int start,int end,int key, int[] arr ) {


        if (start<=end) {
            int mid = start + ((end-start)/2);
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearchArray(start, mid-1, key, arr);
            } else if(arr[mid] < key){
                return binarySearchArray(mid+1, end, key, arr);
            }
        }

        return -1;
    }
}







