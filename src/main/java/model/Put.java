package model;

public class Put {

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (EASY)
     */
    public static void putBombsEasy(char[][] board) {

        int bombs = 10;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 7) + 1;
            positionY = (int) (Math.random() * 9) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '☢';
                bombs--;
            }
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (MEDIUM)
     */
    public static void putBombsMedium(char[][] board) {

        int bombs = 40;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 13) + 1;
            positionY = (int) (Math.random() * 15) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '☢';
                bombs--;
            }
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see (HARD)
     */
    public static void putBombsHard(char[][] board) {

        int bombs = 99;
        int positionX, positionY;

        while (bombs > 0) {

            positionX = (int) (Math.random() * 19) + 1;
            positionY = (int) (Math.random() * 23) + 1;

            if (!collisionBomb(board, positionX, positionY)) {
                board[positionX][positionY] = '☢';
                bombs--;
            }
        }
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see
     */
    public static void putNumbers(char[][] board) {

        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length; j++) {

                if (board[i][j] != '☢') {

                    if (countBombs(board, i, j) == 6) {
                        board[i][j] = '6';
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

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see
     * @param x Coordinate of board 'x'
     * @param y Coordinate of board 'y'
     * @return Returns true if there is a mine in the board cell and false if there is not.
     */
    public static boolean collisionBomb(char[][] board, int x, int y) {
        return board[x][y] == '☢';
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see
     * @param x Coordinate of board 'x'
     * @param y Coordinate of board 'y'
     * @return Returns false if the board cell is outside the board's limits and true if it is inside.
     */
    public static boolean inBoard(char[][] board, int x, int y) {
        return x <= board.length - 1 && y <= board[0].length - 1 && x >= 0;
    }

    /**
     *
     * @param board Matrix representing the dashboard that the user will not see
     * @param x Coordinate of board 'x'
     * @param y Coordinate of board 'y'
     * @return Returns the number of bombs in the 8 squares around the cell
     */
    public static int countBombs (char[][] board, int x, int y) {
        int count = 0;

        if (inBoard(board, x, y - 1) && board[x][y - 1] == '☢') {
            count++;
        }

        if (inBoard(board, x, y + 1) && board[x][y + 1] == '☢') {
            count++;
        }

        if (inBoard(board, x - 1, y  - 1) && board[x - 1][y - 1] == '☢') {
            count++;
        }

        if (inBoard(board, x - 1, y) && board[x - 1][y] == '☢') {
            count++;
        }

        if (inBoard(board, x - 1, y + 1) && board[x - 1][y + 1] == '☢') {
            count++;
        }

        if (inBoard(board, x + 1, y - 1) && board[x + 1][y - 1] == '☢') {
            count++;
        }

        if (inBoard(board, x + 1, y) && board[x + 1][y] == '☢') {
            count++;
        }

        if (inBoard(board, x + 1, y + 1) && board[x + 1][y + 1] == '☢') {
            count++;
        }

        return count;
    }
}

