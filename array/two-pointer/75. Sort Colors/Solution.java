class Solution {
    public void sortColors(int[] nums) {
       /* int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                red++;
            }
            if (nums[i] == 1) {
                white++;
            }
            if (nums[i] == 2) {
                blue++;
            }
        }
        int j = 0;
        while (red > 0) {
            nums[j] = 0;
            j++;
            red--;
        }
        while(white > 0) {
            nums[j] = 1;
            j++;
            white--;
        }
        while (blue > 0) {
            nums[j] = 2;
            j++;
            blue--;
        } */

        int low = 0, mid = 0, high = nums.length-1;
        while (mid <= high) {
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap (nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}