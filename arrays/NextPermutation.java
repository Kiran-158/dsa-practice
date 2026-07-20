public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,3,0,0};
        // int arr[] = {1,5,3,4,5,2,1};

        int index = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int k=0;int j= n-1;
            while(k<j){
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k++;j--;
            }
            for(int a:arr){
                System.out.print(a+" ");
            }
        }
        for(int j=n-1;j>index;j--){
            if(arr[j]>arr[index]){
                int temp= arr[j];
                arr[j]=arr[index];
                arr[index]= temp;
                break;
            }
        }

        reverse(arr,index,n);
        

    }
    static void reverse(int arr[], int index, int n){
        int j=n-1;
        int i = index+1;
        while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;j--;
        }

        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
