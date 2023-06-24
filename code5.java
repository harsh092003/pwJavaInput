import java.util.*;
public class code5 {
    public static void merge(int nums1[],int m,int nums2[],int n){
        int x=m-1;
        int y=n-1;
        int z=m+m-1;
        while(x>=0 && y>=0){
            if(nums1[x]>nums2[y]){
                nums1[z]=nums1[x];
                x--;
            }
            else{
                nums1[z]=nums2[y];
                y--;
            }
            z--;
        }
        while(y>=0){
            nums1[x]=nums2[y];
            y--;
            z--;
        }

    }
    public static void main(String args[]){
        int nums1[]={1,2,3,0,0,0};
        int m=3;
        int nums2[]={2,5,6};
        int n=3;

        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
}
