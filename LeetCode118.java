import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode118 {
    List<List<Integer>> list = new LinkedList<>();

    public List<List<Integer>> generate(int numRows) {
        for (int i = 1; i <=numRows; i++) {
            LinkedList<Integer> list_in = new LinkedList<Integer>();
            for (int j = 1; j <=i ; j++) {
                if((j==i)|| (j == 1)){
                    list_in.add(1);
                }else {
                    LinkedList<Integer> list_tem = (LinkedList<Integer>) list.get(list.size()-1);
                    list_in.add(list_tem.get(j-2)+list_tem.get(j-1));
                }

            }

        list.add(list_in);
        }
        return list;
}
}
