public class RemoveDuplicates1{
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,3,3};

        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        System.out.println("the original elements are: " + i+1);
        for(int k : arr){
            System.out.println(k + " ");
        }
    }

}