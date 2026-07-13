import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int k =3;

        // //brute - TC=O(n^2)  SC= O(1)
        // int maxLength =0;
        // for(int i =0; i<arr.length;i++){
        //     int sum=0;
        //     for(int j =i;j<arr.length;j++){
        //         sum += arr[j];
        //         if(sum ==k){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(maxLength);

        // //Better - TC=O(n)  SC=(n)
        // int sum =0;int maxLength=0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i =0;i < arr.length;i++){
        //     sum += arr[i];
        //     if(sum ==k){
        //         maxLength = i+1;
        //     }
        //     int rem = sum -k;
        //     if(map.containsKey(rem)){
        //        maxLength = Math.max(maxLength, i-map.get(rem)); 
        //     }
        //     if(!map.containsKey(sum)){
        //         map.put(sum,  i);
        //     }
        // }
        // System.out.println(maxLength);

        //optimal - TC=O(n)  SC=(1)
        int left =0,right =0;
        int sum=arr[0], maxLength=0;
        int n = arr.length;
        while (right<n) {
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum ==k){
                maxLength = Math.max(maxLength , right - left +1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }

        }
        System.out.println(maxLength);
    }
}
