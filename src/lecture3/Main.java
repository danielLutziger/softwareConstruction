package lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * lecture: immutability
 * book:
 * - card: immutable, comparison, static factory method
 * - deck: iterator, comparator
 */
public class Main {
    public static void main(String args[]){
        ArrayList x = new ArrayList(Arrays.asList(-4, 3, 5, -1, 0, -23));
        sumAbsolute(x);

    }

    /* method is not immutable and thus altering the list reference */
    public static int sumAbsolute(List<Integer> list){
        for (int i=0; i < list.size(); i++){
            list.set(i, Math.abs(list.get(i)));
        }
        return sum(list);
    }

    public static int sum(List<Integer> list){
        int sum = 0;
        for (int x : list){
            sum += x;
        }
        return sum;
    }
}
