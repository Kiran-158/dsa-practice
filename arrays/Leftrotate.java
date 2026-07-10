public class LeftRotate {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int d =2;
        d%=n;
        

        reverse(arr, 0, d-1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for(int l: arr){
            System.out.print(l +" ");
        }

    }

    private static void reverse(int[] arr, int i, int d) {
        while (i < d) {
            int temp = arr[i];
            arr[i] = arr[d];
            arr[d] = temp;
            i++;
            d--;
        }
    }
}
