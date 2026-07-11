public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 0, 1 };

        int N = arr.length;
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < N; i++) {
            xor1 = xor1 ^ i;
            xor2 = xor2 ^ arr[i];
        }

        xor1 = xor1 ^ N;

        System.out.println(xor1 ^ xor2);
    }
}