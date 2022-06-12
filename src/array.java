import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1};
//        int result = findMaxConsecutiveOnes(arr);
//        System.out.println(result);
//        int[] arr = {213, 23564, 4325, 2413, 3462, 562346, 36516, 143645712, 1235345, 12336, 31};
//        int res = findNumbers(arr);
        int [] arr = {-7,-3,2,3,11};
        int [] res= sortedSquares(arr);
        for (int v :res) {
            System.out.println(v);
        }
        System.out.println();
    }

    static public int findMaxConsecutiveOnes(int[] nums) {
        int maxNumber = 0;
        int curentNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curentNumber++;
            } else {
                curentNumber = 0;
            }
            if (curentNumber > maxNumber) {
                maxNumber = curentNumber;
            }
        }

        return maxNumber;
    }

    static public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            s = String.valueOf(s).length();
            if (s % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static public int[] sortedSquares(int[] nums) {
 //       int [] ar = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }


        return Arrays.stream(nums).sorted().toArray();
    }
}
