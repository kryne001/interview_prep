import java.util.*;
public class App {
    int rowLen;
    int colLen;
    
    public boolean isValidSudoku(char[][] board) {
        this.rowLen = board.length;
        this.colLen = board[0].length;
        if (!isValidRow(board)) return false;
        else if (!isValidColumn(board)) return false;
        else if (!isValidSquare(board)) return false;
        return true;
    }

    private boolean isValidRow(char[][] board)
    {
        for (int i = 0; i < this.rowLen; i++)
        {
            Map<Character,Character> row = new HashMap<Character,Character>();
            for (int j = 0; j < this.colLen; j++)
            {
                char value = board[i][j];
                if (value >= '1' && value <= '9')
                {
                    if(row.containsKey(value)) return false;
                    row.put(value, value);
                }
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board)
    {
        for (int j = 0; j < this.colLen; j++)
        {
            Map<Character,Character> col = new HashMap<Character,Character>();
            for (int i = 0; i < this.rowLen; i++)
            {
                char value = board[i][j];
                if (value >= '1' && value <= '9')
                {
                    if(col.containsKey(value)) return false;
                    col.put(value, value);
                }
            }
        }
        return true;
    }

    private boolean isValidSquare(char[][] board)
    {
        int rowindex = 0;
        int colindex = 0;

        while (rowindex < 9 && colindex < 9)
        {
            int i = 0;
            int j = 0;
            Map<Character,Character> square = new HashMap<Character,Character>();
            for (i = rowindex; i < rowindex+3; i++)
            {
                for (j = colindex; j < colindex+3; j++)
                {
                    char value = board[i][j];
                    if (value >= '1' && value <= '9')
                    {
                        if (square.containsKey(value)) return false;
                        square.put(value, value);
                    }
                }
            }
            if (j < 9) colindex += 3;
            else {
                rowindex+=3;
                colindex = 0;
            }
        }
     
        return true;
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        char[][] board = 
        {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        if (!myApp.isValidSudoku(board)) System.out.println("false");
        else System.out.println("True");

        char[][] board2 = 
        {{'8','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        
        if (!myApp.isValidSudoku(board2)) System.out.println("false");
        else System.out.println("True");

}
}
