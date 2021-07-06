import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {
        int k = lengthOfLongestSubstring("abcaba");
        System.out.println(k);
    }
//    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//    示例 1:
//    输入: s = "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//    示例 2:
//    输入: s = "bbbbb"
//    输出: 1
//    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//    示例 3:
//    输入: s = "pwwkew"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int k_len = 0;
        if (s.length()==0)return 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                left = Math.max(hashMap.get(s.charAt(i))+1,left);
            }
            hashMap.put(s.charAt(i),i);
            k_len= Math.max(i-left+1,k_len);
        }
        return k_len;
}






}
