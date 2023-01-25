public class App {

    public int kthSmallest(int[][] matrix, int k)
    {
        if (matrix.length == 1)
        {
            return matrix[0][0];
        }
        int row = k/matrix.length;
        if (k % matrix.length == 0) row--;
        int column = (k - (row*(matrix[0].length))) - 1;
        return matrix[row][column];
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        int arr1[][] = {{1,5,9},{10,11,13},{12,13,15}};
        int arr2[][] = {{5}};
        int arr3[][] = {{1,2}, {1,3}};
        int answer = myApp.kthSmallest(arr1, 9);
        System.out.println("answer is: " + answer);
    }
}
