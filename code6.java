import java.util.*;
public class code6 {
     public static void main(String args[]){
        int nums[]={1,2,3,1};
        boolean Duplicates= duplicate(nums);
        System.out.println(Duplicates);
    }
    public static boolean duplicate(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
   
}
