public class Visualize {

    public static void showBoard(char[][] board) {

        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(chars[j] + "   ");
            }
            System.out.println();
        }
    }
}