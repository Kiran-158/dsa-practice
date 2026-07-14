import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 7, 9, 6 };
        int target = 7;


//         Unsorted array + return indices → Use HashMap (O(n)), which is considered the optimal solution.
// Sorted array → Use the Two Pointer approach (O(n)).
// If you sort an unsorted array, you lose the original indices, so the two-pointer approach cannot directly return the original indices unless you store additional information.

        // //Better o(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if(map.containsKey(more)){
                System.out.println("indices are: "+ map.get(more) +" " + i);
            return;
            }
            map.put(arr[i], i);
        }
        System.out.println("no solution");

        //optimal O(nlogn) 2 pointer
        Arrays.sort(arr);
        for(int k: arr){
            System.out.print(k +" ");
        }
        System.out.println();
        int left = 0, right = arr.length-1;
        while(left < right){
            int sum= arr[left]+ arr[right];
            if(sum == target){
                System.out.println(left + " " + right);
                return;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

    }

}