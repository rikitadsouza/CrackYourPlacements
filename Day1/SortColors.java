/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
*/
import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        int low =0, mid =0, high =nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp =nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] =nums[high];
                nums[high]= temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        solution.sortColors(nums);

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}