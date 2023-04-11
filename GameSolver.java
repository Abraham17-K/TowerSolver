public class GameSolver {
    private boolean allPiecesOn3rdRow;
    public int diskNum;
    public int[][] tower;
    public GameSolver(int diskNum) {
        int[][] tower = new int[diskNum][3];
        this.diskNum = diskNum;
        for (int i = 0; i < diskNum; i++) {
            tower[i][0] = i+1;
        }
        printBoard(tower);
        this.tower = tower;
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

    public static void movePiece(int num, int row) {
        int unoccupiedIndex;
        for (int i = 0; i < )
    }

    public boolean isEven(int[][] arr){
        return(arr.length % 2 == 0);
    }
}