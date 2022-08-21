import java.util.*;

class NQueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        NQueens(chess, "", 0);
    }

    public static boolean isSafe(int[][] chess, int r, int c) {
        int n = chess.length;
        // for right diagonal traversal
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 1)
                return false;
        }

        // for top traversal
        for (int i = r - 1, j = c; i >= 0; i--) {
            if (chess[i][j] == 1)
                return false;
        }
        // for left diagonal traversal
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1)
                return false;
        }
        return true;
    }

    public static void NQueens(int[][] chess, String asf, int row) {
        if (row == chess.length) {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                NQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;

            }
        }
    }
}