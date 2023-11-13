import controller.Input;
import model.Coordinate;
import model.Initialize;
import model.Put;
import view.Visualize;

public class Game {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        System.out.println();
        System.out.println("                                                                 " + BLUE_BACKGROUND + ANSI_BLACK + "  WELCOME TO THE MINESWEEEPER !  " + ANSI_RESET);
        System.out.println();
        int number = Input.getInteger("                                                        SELECT WHAT YOU WANT TO DO (" + ANSI_CYAN + "1" + ANSI_RESET + " - PLAY  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - EXIT): ");

        while (number > 2 || number < 1) {
            System.out.println("                                                                  " + Input.ANSI_RED + "   ERROR NUMBER, WRITE 1 OR 2 ! " + ANSI_RESET);
            number = Input.getInteger("                                                        SELECT WHAT YOU WANT TO DO (" + ANSI_CYAN + "1" + ANSI_RESET + " - PLAY  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - EXIT): ");
        }

        if (number == 1) {
            instructions();
            System.out.println();

            int level = level();
            int countMines;

            if (level == 1) {
                char[][] board = new char[9][11];
                char[][] boardPlayer = new char[9][11];

                Initialize.initializePlayerBoardEasy(board);
                Initialize.initializePlayerBoardEasy(boardPlayer);

                Put.putBombsEasy(board);
                Put.putNumbers(board);


                Visualize.showBoardEasy(board);
                System.out.println();
                System.out.println();
                Visualize.showBoardEasy(boardPlayer);

                countMines = 10;
                game(board, boardPlayer, countMines, level);

            } else if (level == 2) {
                char[][] board = new char[15][17];
                char[][] boardPlayer = new char[15][17];

                Initialize.initializePlayerBoardMedium(board);
                Initialize.initializePlayerBoardMedium(boardPlayer);

                Put.putBombsMedium(board);
                Put.putNumbers(board);

                Visualize.showBoardMedium(boardPlayer);

                countMines = 40;

                game(board, boardPlayer, countMines, level);

            } else {

                char[][] board = new char[21][25];
                char[][] boardPlayer = new char[21][25];

                Initialize.initializePlayerBoardHard(board);
                Initialize.initializePlayerBoardHard(boardPlayer);

                Put.putBombsHard(board);
                Put.putNumbers(board);

                Visualize.showBoardHard(boardPlayer);

                countMines = 99;

                game(board, boardPlayer, countMines, level);

            }

        } else {
            System.out.println();
            System.out.println("                                                                         " + BLUE_BACKGROUND + ANSI_BLACK + "  SEE YOU SOON !  " + ANSI_RESET);
        }
    }

    public static void instructions() {
        System.out.println();
        System.out.println("                          " + ANSI_BLUE + "------------------------------------------      " + ANSI_RESET + BLUE_BACKGROUND + ANSI_BLACK + "  INSTRUCTIONS  " + ANSI_RESET + ANSI_BLUE + "      ------------------------------------------" + ANSI_RESET);
        System.out.println();
        System.out.println("                          -" + ANSI_CYAN + " Objective" + ANSI_RESET + ": The objective of the game is to clear the playing field without activating any mines. The playing\n                            field is divided into squares, some of which contain mines and some of which do not.");
        System.out.println("                          -" + ANSI_CYAN + " Mines" + ANSI_RESET + ": Some boxes contain mines, and the player must not click on them. If you click on a mine, you lose the\n                            game. The number of mines is 10 / 40 / 99.");
        System.out.println("                          -" + ANSI_CYAN + " Safe spaces" + ANSI_RESET + ": The game begins with all spaces hidden. The player must click on a square to reveal it. If the\n                            revealed space does not contain a mine, it will display a number indicating how many mines are in the adjacent\n                            spaces.");
        System.out.println("                          -" + ANSI_CYAN + " Opening rules" + ANSI_RESET + ": If you click on an empty space without a mine, all adjacent empty spaces will be revealed until\n                            they reach a number. This can help open up large areas of the playing field safely.");
        System.out.println("                          -" + ANSI_CYAN + " Win" + ANSI_RESET + ": The game is won when all safe spaces have been revealed without activating any mines. The goal is to\n                            clear the playing field safely and efficiently.");
        System.out.println("                          -" + ANSI_CYAN + " Lose" + ANSI_RESET + ": The game is lost when you click on a mine.");
        System.out.println();
        System.out.println("                          " + ANSI_BLUE + "----------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
    }

    public static int level() {
        int level = Input.getInteger("                                             SELECT THE LEVEL TO PLAY (1 - " + GREEN_BACKGROUND + "  EASY  " + ANSI_RESET + " / 2 - " + YELLOW_BACKGROUND + "  MEDIUM  " + ANSI_RESET + " / 3 - " + RED_BACKGROUND + "  HARD  " + ANSI_RESET + " ): ");

        while (level > 3 || level < 1) {
            System.out.println("                                                                  " + Input.ANSI_RED + "   ERROR NUMBER, WRITE 1, 2 OR 3 ! " + ANSI_RESET);
            level = Input.getIntegerTwo("                                             SELECT THE LEVEL TO PLAY (1 - " + GREEN_BACKGROUND + "  EASY  " + ANSI_RESET + " / 2 - " + YELLOW_BACKGROUND + "  MEDIUM  " + ANSI_RESET + " / 3 - " + RED_BACKGROUND + "  HARD  " + ANSI_RESET + " ): ");
        }

        System.out.println();
        System.out.println();

        return level;
    }

    public static void game(char[][] board, char[][] boardPlayer, int countMines, int level) {

        int letter, number, num;

        System.out.println();

        do {
            System.out.println("                                                                     " + BLUE_BACKGROUND + ANSI_BLACK + "  * CHOOSE AN OPTION *  " + ANSI_RESET);
            System.out.println();

            if (countMines != 0) {
                num = Input.getIntegerTwo("                                                           " + ANSI_CYAN + "1" + ANSI_RESET + " - Select position  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - Mark a mine (M " + ANSI_BLUE + countMines + ANSI_RESET + ") ");

                while (num > 2 || num < 1) {
                    System.out.println("                                                                  " + Input.ANSI_RED + "   ERROR NUMBER, WRITE 1 OR 2 ! " + ANSI_RESET);
                    num = Input.getIntegerTwo("                                                           " + ANSI_CYAN + "1" + ANSI_RESET + " - Select position  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - Mark a mine (M " + ANSI_BLUE + countMines + ANSI_RESET + ") ");
                }

            } else {
                num = Input.getIntegerTwo("                                                           " + ANSI_CYAN + "1" + ANSI_RESET + " - Select position  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - Mark a mine (M " + ANSI_BLUE + "0" + ANSI_RESET + ") ");

                while (num != 1) {
                    System.out.println(Input.ANSI_RED + "                                                                            ERROR NUMBER !" + ANSI_RESET);
                    num = Input.getIntegerTwo("                                                           " + ANSI_CYAN + "1" + ANSI_RESET + " - Select position  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - Mark a mine (M " + ANSI_BLUE + "0" + ANSI_RESET + ") ");
                }
            }

            if (level == 1) {
                String coordinate = Input.getCoordinate();

                while (Coordinate.wrongLenght(coordinate) ||
                        Coordinate.letterErrorEasy(coordinate.charAt(0)) ||
                        Coordinate.numberErrorEasy(coordinate.charAt(1)) ||
                        boardPlayer[coordinate.charAt(0) - 65][coordinate.charAt(1) - 47] != '-') {

                    System.out.println(ANSI_RED + "                                                                          COORDINATE ERROR !" + ANSI_RESET);
                    coordinate = Input.getCoordinate();
                }

                System.out.println();

                letter = coordinate.charAt(0) - 65;
                number = coordinate.charAt(1) - 47;

            } else if (level == 2) {
                String coordinate = Input.getCoordinateTwo();

                while (Coordinate.wrongLenght(coordinate) ||
                        Coordinate.letterErrorMedium(coordinate.charAt(0)) ||
                        Coordinate.letter2ErrorMedium(coordinate.charAt(1)) ||
                        boardPlayer[coordinate.charAt(0) - 65][coordinate.charAt(1) - 64] != '-') {

                    System.out.println(ANSI_RED + "                                                                          COORDINATE ERROR !" + ANSI_RESET);
                    coordinate = Input.getCoordinateTwo();
                }

                System.out.println();

                letter = coordinate.charAt(0) - 65;
                number = coordinate.charAt(1) - 64;

            } else {
                String coordinate = Input.getCoordinateTwo();

                while (Coordinate.wrongLenght(coordinate) ||
                        Coordinate.letterErrorHard(coordinate.charAt(0)) ||
                        Coordinate.letter2ErrorHard(coordinate.charAt(1)) ||
                        boardPlayer[coordinate.charAt(0) - 65][coordinate.charAt(1) - 64] != '-') {

                    System.out.println(ANSI_RED + "                                                                          COORDINATE ERROR !" + ANSI_RESET);
                    coordinate = Input.getCoordinateTwo();
                }

                System.out.println();

                letter = coordinate.charAt(0) - 65;
                number = coordinate.charAt(1) - 64;

            }

            if (num == 1) {
                clearBox(boardPlayer, board, letter, number);
                boardPlayer[letter][number] = board[letter][number];

            } else {
                boardPlayer[letter][number] = '☢';
                countMines--;
            }

            System.out.println();
            System.out.println();


            if (level == 1) {
                Visualize.showBoardEasy(board);
                System.out.println();
                System.out.println();
                Visualize.showBoardEasy(boardPlayer);
            } else if (level == 2) {
                Visualize.showBoardMedium(boardPlayer);
            } else {
                Visualize.showBoardHard(boardPlayer);
            }
            System.out.println();

        } while (!win(boardPlayer, board) && !Put.collisionBomb(board, letter, number) || num == 2);

        if (Put.collisionBomb(board, letter, number)) {

            Visualize.showBombs(board, boardPlayer);

            System.out.println("                                                                          " + RED_BACKGROUND + "  BOOOOOOM !  " + ANSI_RESET);
            System.out.println();

            if (level == 1) {
                Visualize.showBoardEasy(boardPlayer);
            } else if (level == 2) {
                Visualize.showBoardMedium(boardPlayer);
            } else {
                Visualize.showBoardHard(boardPlayer);
            }

            System.out.println();

        } else {
            System.out.println("CONGRATULATIONS, YOU WON!");
        }
    }


    public static boolean win(char[][] boardPlayer, char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (boardPlayer[i][j] != board[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void clearBox(char[][] boardPlayer, char[][] board, int letter, int number) {

        if (letter < 0 || letter >= boardPlayer.length || number < 0 || number >= boardPlayer[0].length) {
            return;
        }

        if (board[letter][number] == '☢') {
            return;
        }

        if (boardPlayer[letter][number] != '-' || board[letter][number] !=  ' ') {
            boardPlayer[letter][number] = board[letter][number];
            return;
        }

        boardPlayer[letter][number] = board[letter][number];

        int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < x.length; i++) {
            int updateLetter = letter + x[i];
            int updateNumber = number + y[i];

            clearBox(boardPlayer, board, updateLetter, updateNumber);
        }
    }
}