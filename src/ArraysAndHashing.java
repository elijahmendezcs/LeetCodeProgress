import java.util.*;

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

        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int diff = target - num;

            if (temp.containsKey(diff)) {

                return new int[]{temp.get(diff), i};
            }

            temp.put(num, i);
        }

        return nums;
    }

    // Given an array of strings strs, group all anagrams together into sublists.
    // You may return the output in any order.
    // An anagram is a string that contains the exact same characters as another string,
    // but the order of the characters can be different.

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            result.putIfAbsent(sorted, new ArrayList<>());

            result.get(sorted).add(str);
        }

        return new ArrayList<>(result.values());


    }


    // Given an integer array nums and an integer k,
    // return the k most frequent elements within the array.
    // The test cases are generated such that the answer is always unique.
    // You may return the output in any order.

    public int[] topKFrequent(int[] nums, int k) {

        return nums;
    }


    // Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
    // Please implement encode and decode

    public String encode(List<String> strs) {

        return "";
    }

    public List<String> decode(String str) {

        return List.of();
    }


    // Given an integer array nums,
    // return an array output where output[i] is the product of all the elements of nums except nums[i].
    // Each product is guaranteed to fit in a 32-bit integer.
    // Follow-up: Could you solve it in
    // O(n) time without using the division operation?

    public int[] productExceptSelf(int[] nums) {

        return nums;
    }

    // Given an array of integers nums, return the length of the longest consecutive sequence of elements.
    // A consecutive sequence is a sequence of elements in which
    // each element is exactly 1 greater than the previous element.
    // You must write an algorithm that runs in O(n) time.

    public int longestConsecutive(int[] nums) {

        return 0;
    }


}
