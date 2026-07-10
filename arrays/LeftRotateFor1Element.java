public class LeftRotateFor1Element {
    public static void main(String[] args) {
        int arr[] = {2,3,6,1,8,5};

        int temp = arr[0];
        for(int j =1;j<arr.length;j++){
            arr[j-1]= arr[j];
        }
        arr[arr.length-1]= temp;

        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}
