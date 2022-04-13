//"1. Find the smallest missing element from a sorted array

class smallelement{
    public static int findSmallestMissing(int[] nums, int left, int right){
    
        if (left > right) {
            return left;
        }
 
        int mid = left + (right - left) / 2;
 
        if (nums[mid] == mid) {
            return findSmallestMissing(nums, mid + 1, right);
        }
        else {
            return findSmallestMissing(nums, left, mid - 1);
        }
    }
 
    public static void main(String[] args){
        int[] nums = { 0, 1, 2, 3, 4, 5, 6 };
 
        int left = 0, right = nums.length - 1;
        System.out.println("The smallest missing element is "+ findSmallestMissing(nums, left, right));
    }
}



//2. Find the missing term in a sequence in logarithmic time"

class Missingterm{
    
    public static int findMissingTerm(int[] nums){
       
        int left = 0, right = nums.length - 1;
 
        int diff = (nums[nums.length - 1] - nums[0]) / nums.length;
 
        while (left <= right){
    
            int mid = right - (right - left) / 2;
            if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
                return nums[mid + 1] - diff;
            }
            if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
                return nums[mid - 1] + diff;
            }
            if (nums[mid] - nums[0] != (mid - 0) * diff) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
 
    public static void main(String[] args){
        int[] nums = { 5, 7, 9, 11, 15 };
 
        System.out.println("The missing term is " + findMissingTerm(nums));
    }
}