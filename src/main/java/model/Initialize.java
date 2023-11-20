package model;

public class Initialize {

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (EASY)
     */
    public static void initializePlayerBoardEasy(char[][] board) {

        char number = '0';
        char letter = 'A';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (i == 8 && j == 0) {
                    board[i][j] = ' ';

                } else if (i == 8) {
                    board[i][j] = number;
                    number++;

                } else if (i < 8 && j == 0) {
                    board[i][j] = letter;
                    letter++;

                } else {
                    board[i][j] = '-';
                }
            }
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (MEDIUM)
     */
    public static void initializePlayerBoardMedium(char[][] board) {

        char letter = 'A';
        char letter2 = 'A';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (i == 14 && j == 0) {
                    board[i][j] = ' ';

                } else if (i == 14) {
                    board[i][j] = letter2;
                    letter2++;

                } else if (i < 14 && j == 0) {
                    board[i][j] = letter;
                    letter++;

                } else {
                    board[i][j] = '-';
                }
            }
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (HARD)
     */
    public static void initializePlayerBoardHard(char[][] board) {

        char letter = 'A';
        char letter2 = 'A';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (i == 20 && j == 0) {
                    board[i][j] = ' ';

                } else if (i == 20) {
                    board[i][j] = letter2;
                    letter2++;

                } else if (i < 20 && j == 0) {
                    board[i][j] = letter;
                    letter++;

                } else {
                    board[i][j] = '-';
                }
            }
        }
    }
}