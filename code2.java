public class code2 {
    public static int remove(int nums[], int target) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int target = 3;
        int output = remove(nums, target);
        System.out.println(" n : " +output);

        for (int i = 0; i < output; i++) {
            System.out.print(nums[i] +" "+ "_ _");
        }

    }
}

