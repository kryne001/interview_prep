import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> answerKey = new HashMap<Integer, Integer>();

        int i = 0; int compare = 0;
        while (i < nums.length)
        {
            compare = target - nums[i];
            if (answerKey.containsKey(compare))
            {
                return new int[] {answerKey.get(compare), i};
            }
            answerKey.put(nums[i], i);
            i++;
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        Solution mySolution = new Solution();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = myScanner.nextInt();

        int numsArray[] = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++)
        {
            numsArray[i] = myScanner.nextInt();
        }

        System.out.println("Enter target: ");
        int target = myScanner.nextInt();

        myScanner.close();

        int answer[] = new int[2];

        answer = mySolution.twoSum(numsArray, target);

        System.out.println("answer: ");

        for (int i = 0; i < 2; i++)
        {
            System.out.print(answer[i] + " ");
        }

    }
}
