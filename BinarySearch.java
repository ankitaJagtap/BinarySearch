/**
 * BinarySearch
 */
public class BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int first = 0;
        int last = nums.length -1;
        while(first<=last){
            int mid = (first+last)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                last = mid-1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = -1;
        System.out.println(binarySearch(nums, target));
    }
}