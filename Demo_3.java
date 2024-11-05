class FindPeakElement{
    public int findPeakElement(int[] nums) {  // [1,2,3,1]
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low+high)/2;

            if(nums[mid] < nums[mid+1]){
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
public class Demo_3 {
    
}
