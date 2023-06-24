import java.util.*;
public class code7 {
    public static void main(String args[]){
         int nums[]= {0,1,3,0,3,12};
         move(nums);
         System.out.println(Arrays.toString(nums));

    }
    public static void move(int nums[]){
        int l=0;
        for (int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                nums[l]=nums[r];
                l++;
            }
        }
        for (int i=l;i<nums.length;i++){
            nums[i]=0;
        }
    }
    
}
