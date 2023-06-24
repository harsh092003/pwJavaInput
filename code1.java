import java.util.*;
import java.util.Map;

public class code1 {
  public static int[] sum(int nums[], int target) {
    Map<Integer, Integer> remainMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      int remain = target - n;
      if (remainMap.containsKey(remain)) {
        return new int[] { remainMap.get(remain), i };
      }
      remainMap.put(nums[i], i);
    }
    return new int[0];
  }     
  public static void main(String[] args) {
    int nums[] = { 2, 7, 11, 15 };
    int target = 9;
    int output[] = sum(nums, target);
    for (int index : output) {
      System.out.println(Arrays.toString(output) + " ");
    }
  }
}

