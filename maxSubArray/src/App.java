
public class App {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            int num = nums[i]; 
            curSum = Math.max(num, curSum + num);
            maxSum = Math.max(curSum,maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) throws Exception {
        App mySolution = new App();
        int case1[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int case2[] = new int[]{1};
        int case3[] = new int[]{5,4,-1,7,8};

        System.out.println("Input: nums = [-2,1,-3,4,-1,2,1,-5,4]");
        System.out.print("Output: " + mySolution.maxSubArray(case1));
        System.out.println("");

        System.out.println("Input: nums = [1]");
        System.out.print("Output: " + mySolution.maxSubArray(case2));
        System.out.println("");

        System.out.println("Input: nums = [5,4,-1,7,8]");
        System.out.print("Output: " + mySolution.maxSubArray(case3));
        System.out.println("");

    }
}
