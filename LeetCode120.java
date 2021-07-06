import java.util.ArrayList;
import java.util.List;

public class LeetCode120 {
//    给定一个三角形 triangle ，找出自顶向下的最小路径和。
//
//    每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
//
//             
//
//    示例 1：
//
//    输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//    输出：11
//    解释：如下面简图所示：
//            2
//            3 4
//            6 5 7
//            4 1 8 3
//    自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[2][n];
        f[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            int curr = i % 2;
            int prev = 1 - curr;
            f[curr][0] = f[prev][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                f[curr][j] = Math.min(f[prev][j - 1], f[prev][j]) + triangle.get(i).get(j);
            }
            f[curr][i] = f[prev][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = f[(n - 1) % 2][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[(n - 1) % 2][i]);
        }
        return minTotal;
    }


}
