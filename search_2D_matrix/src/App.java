public class App {

    public boolean searchMatrixFinal(int[][] matrix, int target)
    {
        int start = 0;
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        int end = (rows*cols) - 1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            int curRow = mid/cols;
            int curCol = mid%cols;
            int value = matrix[curRow][curCol];
            if(value == target) return true;
            else
            {
                if (target > value) start = mid+1;
                else end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        App myApp = new App();
        int arr1[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int arr2[][] = {{1,1}};
        int arr3[][] = {{1,3,5}};
        int arr4[][] = {{1}, {3}, {5}};
        if (!myApp.searchMatrixFinal(arr1, 30)) System.out.println("False");
        else System.out.println("True");
    }
}
