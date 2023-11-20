package view;

import model.ConsoleColors;

public class Visualize {
    public static void showBoardEasy(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 8 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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

    public static void removeBombsEasy(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 8 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_RED + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 14 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_RED + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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

    public static void removeBombsMedium(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 14 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_RED + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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

    public static void showBoardHard(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 20 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_RED + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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

    public static void removeBombsHard(char[][] board) {

        for (int i = 0; i  < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] ==  '☢') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                } else if (i < 20 && j > 0) {
                    if (board[i][j] == '1') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_YELLOW + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '2') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_GREEN + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '3') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_BLUE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '4') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_PURPLE + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else if (board[i][j] == '5') {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + ConsoleColors.ANSI_RED + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
                    } else {
                        System.out.print(ConsoleColors.GREY_BACKGROUND + " " + board[i][j] + " " + ConsoleColors.ANSI_RESET);
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