public class MaximumSubarraySum{
    public static void main(String[] args) {
        int arr[]= {-1,-2,4,1,-3,5,-3};

        //Kadanes_Algorith 
        int max = arr[0];
        int sum =arr[0];
        for(int a=1;a<arr.length;a++){
            sum= Math.max(arr[a], sum+arr[a]);
            max= Math.max(max, sum);
        }
        System.out.println(max);
    }
}