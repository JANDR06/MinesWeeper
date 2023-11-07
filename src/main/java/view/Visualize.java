package view;

public class Visualize {

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREY_BACKGROUND = "\u001B[47m";

    public static void showBoardEasy(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '*') {
                    System.out.print(ANSI_RED_BACKGROUND + " " + board[i][j] + " " + ANSI_RESET);
                } else if (i < 8 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_YELLOW + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_GREEN + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_BLUE + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_PURPLE + " " + board[i][j] + " " + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_GREY_BACKGROUND  + " " + board[i][j] + " " + ANSI_RESET);
                    }

                } else {

                    if (j == 0) {
                        System.out.print("                                                                 " + board[i][0] + " ");
                    } else {
                        System.out.print(" " + board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void showBoardMedium(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '*') {
                    System.out.print(ANSI_RED_BACKGROUND + " " + board[i][j] + " " + ANSI_RESET);
                } else if (i < 14 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_YELLOW + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_GREEN + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_BLUE + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_PURPLE + " " + board[i][j] + " " + ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ANSI_GREY_BACKGROUND + ANSI_RED + " " + board[i][j] + " " + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_GREY_BACKGROUND  + " " + board[i][j] + " " + ANSI_RESET);
                    }

                } else {

                    if (j == 0) {
                        System.out.print("                                                       " + board[i][0] + " ");
                    } else {
                        System.out.print(" " + board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void showBombs(char[][] board , char[][] boardPlayer) {

        for (int i = 0; i < boardPlayer.length; i++) {
            for (int j = 0; j < boardPlayer[0].length; j++) {

                if (board[i][j] == '*') {
                    boardPlayer[i][j] = '*';
                }
            }
        }
    }


}