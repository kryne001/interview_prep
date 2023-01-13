public class App {
    public int[] productExceptSelf(int[] nums) {
        //create answer array
        int[] answer = new int[nums.length];
        int prev = 0; int i = 0; int temp = 0;
        for (i = 0; i < nums.length; i++)
        {
            if (i == 0)
            {
                answer[i] = 1;
                prev = 1;
            }
            else
            {
                answer[i] = prev * nums[i-1];
                prev *= answer[i];
            }
        }

        for (i = answer.length - 1; i >= 0; i--)
        {
            if(i == answer.length - 1)
            {
                prev = 1;
            }
            else
            {
                temp = prev * nums[i+1] * answer[i];
                answer[i] = temp;
                prev *= nums[i+1];
            }
        }

        return answer;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
