import java.util.Arrays;
import java.util.HashSet;

public class Blind75 {

    // Starting the NeetCode Blind 75.
    // Format code with ⌘+ ⌥ + L

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

}
