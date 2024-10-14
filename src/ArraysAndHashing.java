import java.util.Arrays;
import java.util.HashSet;

public class ArraysAndHashing {


    // Given an integer array nums, return true
    // if any value appears more than once in the array, otherwise return false.

    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> x = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (x.contains(nums[i])) {

                return true;
            }

            x.add(nums[i]);
        }

        return false;

    }


    // Given two strings s and t, return true
    // if the two strings are anagrams of each other, otherwise return false.

    // An anagram is a string that contains the exact same characters as another string
    // but the order of the characters can be different.


    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {

            return false;
        }

        char[] x = s.toCharArray();
        char[] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);


        if (Arrays.equals(x, y)) {

            return true;
        }


        return false;


    }

    // Given an array of integers nums and an integer target,
    // return the indices i and j such that nums[i] + nums[j] == target and i != j.

    //You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
    //Return the answer with the smaller index first.


    public int[] twoSum(int[] nums, int target) {


        return nums;
    }


}
