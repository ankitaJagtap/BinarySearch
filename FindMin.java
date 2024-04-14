/**
 * Find Minimum in Rotated Sorted Array
 */
public class FindMin {

    public static int findMin(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        while(first<last){
            int mid = (first+last)/2;
            if(arr[mid] > arr[last]){
                first = mid + 1;
            }else if(arr[mid] < arr[last]){
                last = mid;
            }
        }
        return arr[first];
    }


    public static void main(String[] args) {
        int[] arr = {67, 70, 20, 61, 64};
        System.out.println(findMin(arr));
    }
}