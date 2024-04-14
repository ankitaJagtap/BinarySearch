/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1;
        int ans = 0;
        while(first<=last){
            int mid = (first+last)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                last = mid -1;
            }else{
                first = mid + 1;
            }
        }
        if(first > last){
            return first;
        }else{
            return last;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int k = 3;
        System.out.println(searchInsert(arr, k));
    }
}