import java.util.LinkedList;
import java.util.List;

public class LeetCode119 {
    List<List<Integer>> list = new LinkedList<>();

    public List<Integer> getRow(int rowIndex) {
        for (int i = 1; i <=rowIndex+1; i++) {
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
        return list.get(list.size()-1);
}
}
