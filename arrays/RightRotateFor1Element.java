public class RightRotateFor1Element {
    public static void main(String[] args) {
        int arr[] = {2,3,6,1,8,5};

        int temp = arr[arr.length-1];
        for(int j =arr.length-2;j>=0;j--){
            arr[j+1]= arr[j];
        }
        arr[0]= temp;

        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}

