import java.util.ArrayList;
import java.util.List;

public class BackTracking {
    public static void printperm(String a, int idx, String permutation) {
        if (a.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char curaChar = a.charAt(i);
            String newStr = a.substring(0, i) + a.substring(i + 1);
            printperm(newStr, idx + 1, permutation + curaChar);

        }

    }

    public static void recur(char[][] board, List<List<String>> boards, int col) {
        if (col == board.length) {
            save(board, boards);
            return;
        }

        for (int row = 0; row <= board.length; row++) {
            if(row==board.length){
                System.out.println(boards);
                return;
            }
            if (isSafe(row, col, board)) {
                board[row][col] = 'q';
                recur(board, boards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // horizz check
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'q') {
                return false;
            }
        }
        // vert
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'q') {
                return false;
            }
        }
        // U-left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'q') {
                return false;
            }
        }
        // U-Right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'q') {
                return false;
            }
        }

        // L-left
        r = row;
        for (int c = col; r < board.length && c >= 0; c--, r++) {
            if (board[r][c] == 'q') {
                return false;
            }
        }

        // L-right
        r = row;
        for (int c = col; r < board.length && c < board.length; c++, r++) {
            if (board[r][c] == 'q') {
                return false;
            }
        }
        return true;
    }

    public static void save(char[][] board, List<List<String>> boards) {
        String row = "";
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";

            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'q') {
                    row += 'q';
                } else {
                    row += '.';
                }
                newboard.add(row);
            }
        }
        boards.add(newboard);
        return;
    }

    // public static List<List<String>> main(int n) {
    public static void main(String[] args) {
        List<List<String>> boards = new ArrayList<>();
        char[][] board = new char[4][4];
        recur(board, boards, 0);
    }

    // public static void main(String[] args) {
    // String s="abc";
    // printperm(s, 0, " ");
    // }

}
