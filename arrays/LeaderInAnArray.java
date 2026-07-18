import java.util.ArrayList;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int arr[]= {10,22,12,0,3,6};

        int max= Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        for(int k:list){
            System.out.print(k + " ");
        }
    }
}
