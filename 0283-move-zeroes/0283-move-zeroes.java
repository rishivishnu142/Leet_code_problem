class Solution {
    public void moveZeroes(int[] nums) {
   int arr[] = {1, 0, 2, 0, 3, 4, 0};

        int index = 0;

     
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

      
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
            
        }
    }
