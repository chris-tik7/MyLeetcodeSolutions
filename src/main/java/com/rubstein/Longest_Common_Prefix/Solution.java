package com.rubstein.Longest_Common_Prefix;

public class Solution {
    static void main() {
        String[] foo = {"flower", "flow", "flight"};
        String[] bar = {"dust", "coffee"};

        System.out.println(longestCommonPrefix(foo));
        System.out.println(longestCommonPrefix(bar));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        int p = 0;
        char c;
        int max = strs[0].length();

        for (String s : strs) {
            if (s.length() < max) {
                max = s.length();
            }
        }

        outerLoop:
        while (true) {
            if (p >= max) break;
            c = strs[0].charAt(p);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(p) != c) {
                    break outerLoop;
                }
            }
            p++;
            output.append(c);
        }

        return output.toString().isEmpty() ? "no common prefix :(" : output.toString();
    }
}