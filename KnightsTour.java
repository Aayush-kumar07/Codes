import java.util.*;

class KnightsTour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        int row = scn.nextInt();
        int col = scn.nextInt();
        KnightsTour(chess, row, col, 1);

    }

    public static void display(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public static void KnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // bahar chala gya hai
        if (r < 0 || r >= chess.length || c < 0 || c >= chess[0].length || chess[r][c] != 0) {
            return;
        }

        // answer mil gya hai
        if (upcomingMove == chess.length * chess.length) {
            chess[r][c] = upcomingMove;
            display(chess);
            chess[r][c] = 0;
            return;
        }
        // mark
        chess[r][c] = upcomingMove;
        // calls
        for (int d = 0; d < dir.length; d++) {
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            KnightsTour(chess, x, y, upcomingMove + 1);
        }
        chess[r][c] = 0;

    }
}