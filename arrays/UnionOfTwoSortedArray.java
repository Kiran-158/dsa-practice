import java.util.ArrayList;
// import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,2,3,5,6,9,10};


        // //brute force
        // TreeSet<Integer> set = new TreeSet<>();
        
        // for(int i = 0; i< arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        // for(int i = 0; i< arr2.length;i++){
        //     set.add(arr2[i]);
        // }

        // System.out.println(set);

        //optimal solution
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i =0;int j =0;

        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.getLast()!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 || list.getLast()!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (j<n2) {
            if(list.size()==0 || list.getLast()!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
        }
        while (i<n1) {
            if(list.size()==0 || list.getLast()!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
        }

        System.out.println(list);

    }
}
