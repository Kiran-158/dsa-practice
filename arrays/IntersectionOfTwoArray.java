import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int b[] = {1,1,3,3,5,6,7,8,9};

        int n1 = a.length;
        int n2 = b.length;

        int i =0;int j=0;

        List<Integer> list = new ArrayList<>();

        while (i <n1 && j<n2) {
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                list.add(a[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);
    }
}
