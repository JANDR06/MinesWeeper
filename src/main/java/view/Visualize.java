package view;

import model.Console;

public class Visualize {

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (EASY)
     */
    public static void showBoardEasy(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.RED_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 8 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
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

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (EASY)
     */
    public static void removeBombsEasy(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.GREEN_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 8 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_RED + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
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

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (MEDIUM)
     */
    public static void showBoardMedium(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.RED_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 14 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_RED + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
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

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (MEDIUM)
     */
    public static void removeBombsMedium(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.RED_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 14 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_RED + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
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

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (HARD)
     */
    public static void showBoardHard(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.RED_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 20 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_RED + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                    }

                } else {

                    if (j == 0) {
                        System.out.print("                                             " + board[i][0] + " ");
                    } else {
                        System.out.print(" " + board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (HARD)
     */
    public static void removeBombsHard(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(Console.GREEN_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                } else if (i < 20 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_YELLOW + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_GREEN + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_BLUE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_PURPLE + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(Console.GREY_BACKGROUND + Console.ANSI_RED + " " + board[i][j] + " " + Console.ANSI_RESET);
                    } else {
                        System.out.print(Console.GREY_BACKGROUND + " " + board[i][j] + " " + Console.ANSI_RESET);
                    }

                } else {

                    if (j == 0) {
                        System.out.print("                                             " + board[i][0] + " ");
                    } else {
                        System.out.print(" " + board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see
     * @param boardPlayer Matrix representing the dashboard that the user will see
     */
    public static void showBombs(char[][] board , char[][] boardPlayer) {

        for (int i = 0; i < boardPlayer.length; i++) {
            for (int j = 0; j < boardPlayer[0].length; j++) {

                if (board[i][j] == '☢') {
                    boardPlayer[i][j] = '☢';
                }
            }
        }
    }
}