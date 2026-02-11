package com.mainapp;

public class TwoSumArray {

    static void main() {

        int[] ints = twoSum();


    }

    static  int[] twoSum() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
            int x = target - ans;
            if (x == target) {
                return new int[]{x, i};
            }
        }
        return
    }

}
