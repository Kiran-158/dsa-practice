public class MoveZeroToEnd {
    public static void main(String[] args) {

        int arr[] = {1, 0, 3, 4, 0, 6, 7, 0, 0, 4};

        int i =0;
        for(int j = 0; j<arr.length; j++){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                i++;
            }
        }
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}