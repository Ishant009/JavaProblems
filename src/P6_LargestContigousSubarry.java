
public class P6_LargestContigousSubarry {

    public int largestSubarry(int[] arr){
        int maxSum=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0) sum=0;
            System.out.println(sum+"   "+maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args){
        P6_LargestContigousSubarry p6= new P6_LargestContigousSubarry();
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int sum=p6.largestSubarry(arr);
        System.out.println(sum);
    }
}
