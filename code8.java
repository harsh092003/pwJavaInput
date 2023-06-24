import java.util.*;
public class code8 {
    public static void main(String args[]){
        int nums[]={1,2,2,4};
        int output[]=error(nums);
        System.out.println(Arrays.toString(output));
    }
    public static int[] error(int nums[]){
        int[] output = new int[2];
        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                output[0] = index + 1; // Duplicate number
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                output[1] = i + 1; // Missing number
                break;
            }
        }

        return output;
    }
    
}
