public class NumberappersOnceAndOtherAppearsTwicw {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5};

        //brute -- O(n^2) by neted loop
        //better -- O(nlogn) by hashmap
        //optimal -- O(n) by XOR

        int xor = 0;
        for(int i =0; i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
