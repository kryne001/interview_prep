public class App {
    private int answer = -1;
    public int search(int[] nums, int target) {
        helper(nums, target, 0, nums.length - 1);
        return answer;
    }

    private void helper(int[] arr, int target, int start, int end)
    {
        int guess = (end+start) / 2;
        if (arr[guess] == target)
        {
            answer = guess;
            return;
        }
        else if (start == end)
        {
            if (arr[start] == target) answer = start;
            return;
        }
        else if (end == start+1)
        {
            if (arr[start] == target) answer = start;
            else if (arr[end] == target) answer = end;
            return;
        }
        else
        {
            if (target > arr[guess]) helper(arr, target, guess, end); 
            else helper(arr, target, start, guess - 1); 
        }
    }

    public int search_loop(int[] nums, int target)
    {
        int start = 0; int end = nums.length - 1;
        while (start <= end)
        {
            int guess = (end+start) / 2;
            if (nums[guess] == target) return guess;
            else if (target > nums[guess]) start = guess+1;
            else end = guess - 1; 
        }

        return -1;
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int ans_rec = myApp.search(nums, 9);
        int ans_loop = myApp.search_loop(nums, 9);
        System.out.println("answer with recursion is: " + ans_rec);
        System.out.println("answer with loops is: " + ans_loop);
    }
}
