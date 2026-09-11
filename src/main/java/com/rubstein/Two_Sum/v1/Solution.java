package com.rubstein.Two_Sum.v1;

class Solution {
    static void main() {
        int[] nums = {2, 7, 11, 15};
        int target = 22;

        int[] res = twoSum(nums, target);

        for (int r : res) {
            System.out.print(r + " ");
        }


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }

            }
        }
        return res;
    }
}