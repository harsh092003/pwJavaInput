public class code4 {
    public static int[] increment(int nums[]){
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            nums[i]++;
            if(nums[i]<10){
                return nums;
            }
            nums[i]=0;
        }
        int newNums[]=new int[n+1];
        newNums[0]=1;
        return newNums;
    }

    public static void main(String args[]){
        int nums[]={1,2,3};
        int output[]=increment(nums);
        for(int num :output){
            System.out.print(num + " ");

        }
    }
}

