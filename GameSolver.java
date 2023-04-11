public class GameSolver {
    private boolean allPiecesOn3rdRow;
    public int diskNum;
    private int[][] tower;
    public GameSolver(int diskNum) {
        int[][] tower1 = new int[diskNum][3];
        this.diskNum = diskNum;
        for (int i = 0; i < diskNum; i++) {
            tower1[i][0] = i+1;
        }
        printBoard(tower);
        this.tower = tower1;
    }

    public void solve() {
        if (allPiecesOn3rdRow) {
            return;
        }
        if (diskNum % 2 == 0) {
            
        } else {
            
        }
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(" " + board[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void movePiece(int num, int row) {
        for (int i = 0; i < tower.length; i++) {
            int rowIndex = -1;
            int verticalIndex = -1;
            if (indexOf(num, tower[i]) != -1) {
                rowIndex = i;
            }
        }
        for (int i = 0; i < tower[row].length - 1; i++) {
            if (tower[i][row] != 0) {
                tower[i][row] = num;
                break;
            }
            if (i >= tower.length - 1) {
                throw new Exception("Row " + row + " Full!");
            }
        }

        
    }

    public boolean isEven(int[][] arr){
        return(arr.length % 2 == 0);
    }

    /**
     * <p> Finds the index of something in an array. </p>
     * <p> Returns only the first index. </p>
     * <p> Returns -1 if it is not found. </p>
     */
    public int indexOf(T value, T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}