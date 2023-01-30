public class App {
    public int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        else if (nums.length == 1) return nums[0];
        int pivot = getPivot(nums);
        if (pivot == -1) return nums[0];
        else return nums[pivot];
    }

    private int getPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) return -1;
        while (start <= end)
        {
            int mid = (start+end)/2;
            if (arr[mid] > arr[mid+1]) return mid+1;
            else
            {
                if (arr[mid] < arr[start]) end = mid -1;
                else start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
