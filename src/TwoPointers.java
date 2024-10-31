import java.util.List;

public class TwoPointers {


    // Given a string s, return true if it is a palindrome, otherwise return false.
    // A palindrome is a string that reads the same forward and backward.
    // It is also case-insensitive and ignores all non-alphanumeric characters.

    public boolean isPalindrome(String s) {

        StringBuilder x = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                x.append(Character.toLowerCase(c));
            }
        }
        String fixedString = x.toString();
        int a = 0;
        int b = fixedString.length() - 1;

        while (a<=b) {
            if(fixedString.charAt(a) != fixedString.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }


    // Given an integer array nums,
    // return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0,
    // and the indices i, j and k are all distinct.
    // The output should not contain any duplicate triplets.
    // You may return the output and the triplets in any order.


    public List<List<Integer>> threeSum(int[] nums) {

        return List.of();
    }

    // You are given an integer array heights where heights[i] represents the height of the ith bar
    // You may choose any two bars to form a container. Return the maximum amount of water a container can store.

    public int maxArea(int[] heights) {

        return 0;
    }



    // Reverse string O(n)

    public void reverseString(char[] s ) {

        int a_pointer = 0;
        int b_pointer = s.length - 1;

        while(a_pointer <= b_pointer) {
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;

            a_pointer++;
            b_pointer--;

        }
    }
}
