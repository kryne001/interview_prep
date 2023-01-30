public class App {
    public int findMin(int[] nums) {
        if (nums.length == 0) return -1; // return -1 since nothing in array
        else if (nums.length == 1) return nums[0]; // return only item in array

        int pivot = getPivot(nums); // returns pivot index
        if (pivot == -1) return nums[0]; // if pivot is -1, means the array is sorted and beginning of array is mid
        else return nums[pivot]; // pivot point is smallest element always (when size > 1)
    }

    private int getPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) return -1; // no pivot, return -1 flag
        while (start <= end)
        {
            int mid = (start+end)/2; // find mid point 
            if (arr[mid] > arr[mid+1]) return mid+1; // if next index smaller than current, found pivot, return index of next index
            else
            {
                if (arr[mid] < arr[start]) end = mid -1; // check left side
                else start = mid+1; // check right side
            }
        }
        return -1; // no pivot
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
