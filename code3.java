public class code3 {
    public static int search(int nums[],int target){
        int l;
        int r;
        l=0;
        r=nums.length-1;
        while(l<=r){
            int m;
            m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if (nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
return l;
    }
        
     public static void main(String args[]){

        int nums[]={1,3,5,6};
        int target=5;
        int output=search(nums,target);
        System.out.println(output);

     }   
    
}

