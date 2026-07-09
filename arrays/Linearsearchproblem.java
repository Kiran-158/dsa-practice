public class Linearsearchproblem{
    public static void main(String[] args) {
        int arr[] = {2,5,3,7,5,9,6};
        int target = 6;

        int result =search(arr, target);
        System.out.println("the target found at: " + result);
    }
    static int search(int arr[], int target){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}