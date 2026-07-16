public class SortArraysOf0and1and2{
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,2,2,1,0,2,2,1,0,1,2,0};

        int low =0, mid= 0; int high = arr.length-1;
        for(int i =0;i<arr.length;i++){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]= temp;
                low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]= temp;
                high--;
            }
        }

        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}