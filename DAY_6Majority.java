import java.util.*;
public class DAY_6Majority {

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 1, 3, 2, 1, 1};
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            int ele = it.getKey();
            int cnt = it.getValue();
          
            // Add the element to the result, if its frequency
        	// if greater than floor(n/3)
            if (cnt > n / 3)
                res.add(ele);
        }
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}