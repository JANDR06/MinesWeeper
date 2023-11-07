package model;

public class Put {
    public static void putBombsEasy(char[][] board) {

        int bombs = 10;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 7) + 1;
            positionY = (int) (Math.random() * 9) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '*';
                bombs--;
            }
        }
    }

    public static void putBombsMedium(char[][] board) {

        int bombs = 40;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 13) + 1;
            positionY = (int) (Math.random() * 15) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '*';
                bombs--;
            }
        }
    }

    public static void putBombsHard(char[][] board) {

        int bombs = 99;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 19) + 1;
            positionY = (int) (Math.random() * 23) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '*';
                bombs--;
            }
        }
    }

    public static void putNumbers(char[][] board) {

        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length; j++) {

                if (board[i][j] != '*') {

                    if (countBombs(board, i, j) == 6) {
                        board[i][j] = '5';
                    } else if (countBombs(board, i, j) == 5) {
                        board[i][j] = '5';
                    } else if (countBombs(board, i, j) == 4) {
                        board[i][j] = '4';
                    } else if (countBombs(board, i, j) == 3) {
                        board[i][j] = '3';
                    } else if (countBombs(board, i, j) == 2) {
                        board[i][j] = '2';
                    } else if (countBombs(board, i, j) == 1) {
                        board[i][j] = '1';
                    } else {
                        board[i][j] = ' ';
                    }
                }
            }
        }
    }

    public static boolean collisionBomb(char[][] board, int x, int y) {
        return board[x][y] == '*';
    }

    public static boolean inBoard(char[][] board, int x, int y) {
        return x <= board.length - 1 && y <= board[0].length - 1 && x >= 0;
    }

    public static int countBombs (char[][] board, int x, int y) {
        int count = 0;

        if (inBoard(board, x, y - 1) && board[x][y - 1] == '*') {
            count++;
        }

        if (inBoard(board, x, y + 1) && board[x][y + 1] == '*') {
            count++;
        }

        if (inBoard(board, x - 1, y  - 1) && board[x - 1][y - 1] == '*') {
            count++;
        }

        if (inBoard(board, x - 1, y) && board[x - 1][y] == '*') {
            count++;
        }

        if (inBoard(board, x - 1, y + 1) && board[x - 1][y + 1] == '*') {
            count++;
        }

        if (inBoard(board, x + 1, y - 1) && board[x + 1][y - 1] == '*') {
            count++;
        }

        if (inBoard(board, x + 1, y) && board[x + 1][y] == '*') {
            count++;
        }

        if (inBoard(board, x + 1, y + 1) && board[x + 1][y + 1] == '*') {
            count++;
        }

        return count;
    }

    public static char spaces (char[][] board, int x, int y) {

        if (board[x][y] != ' ') {
            return board[x][y];
        }


        return spaces(board, x + 1, y);
    }
}

