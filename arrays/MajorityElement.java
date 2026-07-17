import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,4,2,3,4,2,4,3,2,2,2,2};

        //brute O(n);
        //better O(n) hashing ;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int a : arr){
            map.put(a,map.getOrDefault(a, 0)+1);
            if(map.get(a)>(n/2)){
                System.out.println(a);
                return;
            }
        }
        
        //optimal O(n) TC O(1);
        int el =0;
        int count=0;
        for(int a:arr){
            if(count==0){
                el = a;
                count =1;
            }else if(a==el){
                count++;
            }else{
                count--;
            }
        }

        //verify
        int count1=0;
        for(int m: arr){
            if(m==el){
                count1++;
            }
        }
        if(count1 >arr.length/2){
            System.out.println(el);
        }else{
            System.out.println(-1);
        }
    }
}
