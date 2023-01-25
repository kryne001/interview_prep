public class App {
    int[] nums;
    int target;
    public int search(int[] nums, int target) {
        if (nums.length == 0)
        {
            return -1;
        }
        else if (nums.length == 1)
        {
            if (nums[0] == target) return 0;
            else return -1;
        }
        else if (nums.length == 2)
        {
            if (nums[0] == target) return 0;
            else if (nums[1] == target) return 1;
            else return -1;
        }
        this.nums = nums;
        this.target = target;
        int pivot = getPivot(nums); int start = -1; int end = -1;
        if (pivot == -1)
        {
            start = 0;
            end = nums.length-1;
        }
        else if (target > nums[nums.length - 1])
        {
            start = 0;
            end = pivot-1;
        }
        else 
        {
            start = pivot;
            end = nums.length - 1; 
        }
        int answer = helper(nums, target, start, end);
        return answer;
    }

    // private int answer = -1;

    private int getPivot(int[] arr)
    {
        int left = 0; int right = arr.length - 1;
        if (nums[left] < nums[right])
            return -1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] > nums[pivot + 1])
                return pivot + 1;
            else {
                if (nums[pivot] < nums[left])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return -1;
    }

    public int helper(int[] nums, int target, int start, int end)
    {
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
        int[] nums = {8,9,2,3,4};
        int answer = myApp.search(nums, 4);
        System.out.println("answer is: " + answer);
    }
}