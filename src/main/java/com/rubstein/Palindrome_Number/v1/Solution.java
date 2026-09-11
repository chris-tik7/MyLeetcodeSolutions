package com.rubstein.Palindrome_Number.v1;

class Solution {
    public static void main(String[] args) {
        int foo = 20909;
        int bar = 20900902;
        int lol = -20900902;

        System.out.println(isPalindrome(foo));
        System.out.println(isPalindrome(bar));
        System.out.println(isPalindrome(lol));
    }

    public static boolean isPalindrome(int x) {
        String n = String.valueOf(x);

        int l = 0, r = n.length() - 1;
        for(int i = 0; i < n.length() / 2 + 1; i++) {
            if (n.charAt(l) != n.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
}
