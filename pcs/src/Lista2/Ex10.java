package Lista2;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

    public static void main(String args[]) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        
        for(int i = 1; i < 10; i++) {
            List<Integer> listI = new ArrayList<Integer>();
            for(int j = i; j <= 100; j+=i)
                listI.add(j);
            mainList.add(listI);
        }
        
        int count = 1; 
        for (List<Integer> list : mainList) {
            System.out.print(count++ + ": ");
            for(int i : list)
                System.out.print(i + " ");
            System.out.print("\n");
        }
    }
}
