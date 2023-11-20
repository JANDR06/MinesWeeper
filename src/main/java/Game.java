import controller.Input;
import model.ConsoleColors;
import model.Coordinate;
import model.Initialize;
import model.Put;
import view.Visualize;

public class Game {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        System.out.println();
        System.out.println("                                                                " + ConsoleColors.BLUE_BACKGROUND + ConsoleColors.ANSI_BLACK + "  WELCOME TO THE MINESWEEEPER ! \uD83D\uDCA3  " + ConsoleColors.ANSI_RESET);
        System.out.println();
        int number = Input.getInteger("                                                  SELECT WHAT YOU WANT TO DO (1 - " + ConsoleColors.GREEN_BACKGROUND + "  PLAY ▶️" + ConsoleColors.ANSI_RESET + "  /  2 - " + ConsoleColors.RED_BACKGROUND + "  EXIT \uD83D\uDEAA  " + ConsoleColors.ANSI_RESET + " ): ");

        while (number > 2 || number < 1) {
            System.out.println("                                                                 " + ConsoleColors.ANSI_RED + "   ERROR NUMBER, WRITE 1 OR 2 ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
            number = Input.getInteger("                                                  SELECT WHAT YOU WANT TO DO (1 - " + ConsoleColors.GREEN_BACKGROUND + "  PLAY ▶️" + ConsoleColors.ANSI_RESET + "  /  2 - " + ConsoleColors.RED_BACKGROUND + "  EXIT \uD83D\uDEAA  " + ConsoleColors.ANSI_RESET + " ): ");
        }

        if (number == 1) {
            instructions();
            System.out.println();

            int playAgain;

            do {
                int level = level();
                int countMines;

                if (level == 1) {
                    char[][] board = new char[9][11];
                    char[][] boardPlayer = new char[9][11];

                    Initialize.initializePlayerBoardEasy(board);
                    Initialize.initializePlayerBoardEasy(boardPlayer);

                    Put.putBombsEasy(board);
                    Put.putNumbers(board);

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

                System.out.println();

                playAgain = Input.getInteger("                                               DO YOU WANT TO PLAY AGAIN ? (1 - " + ConsoleColors.GREEN_BACKGROUND + "  PLAY ▶️" + ConsoleColors.ANSI_RESET + "  /  2 - " + ConsoleColors.RED_BACKGROUND + "  EXIT \uD83D\uDEAA  " + ConsoleColors.ANSI_RESET + " ): ");

                while (playAgain > 2 || playAgain < 1) {
                    System.out.println("                                                                 " + ConsoleColors.ANSI_RED + "   ERROR NUMBER, WRITE 1 OR 2 ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
                    playAgain = Input.getInteger("                                               DO YOU WANT TO PLAY AGAIN ? (1 - " + ConsoleColors.GREEN_BACKGROUND + "  PLAY ▶️" + ConsoleColors.ANSI_RESET + "  /  2 - " + ConsoleColors.RED_BACKGROUND + "  EXIT \uD83D\uDEAA  " + ConsoleColors.ANSI_RESET + " ): ");
                }

                System.out.println();

            } while (playAgain != 2);

            System.out.println("                                                                        " + ConsoleColors.BLUE_BACKGROUND + ConsoleColors.ANSI_BLACK + "  SEE YOU SOON ! \uD83D\uDC4B  " + ConsoleColors.ANSI_RESET);


        } else {
            System.out.println();
            System.out.println("                                                                        " + ConsoleColors.BLUE_BACKGROUND + ConsoleColors.ANSI_BLACK + "  SEE YOU SOON ! \uD83D\uDC4B  " + ConsoleColors.ANSI_RESET);
        }
    }

    public static void instructions() {
        System.out.println();
        System.out.println("                          " + ConsoleColors.ANSI_BLUE + "-----------------------------------------      " + ConsoleColors.ANSI_RESET + ConsoleColors.BLUE_BACKGROUND + ConsoleColors.ANSI_BLACK + "  INSTRUCTIONS \uD83D\uDCCB  " + ConsoleColors.ANSI_RESET + ConsoleColors.ANSI_BLUE + "      ----------------------------------------" + ConsoleColors.ANSI_RESET);
        System.out.println();
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Objective" + ConsoleColors.ANSI_RESET + ": The objective of the game is to clear the playing field without activating any mines. The playing\n                            field is divided into squares, some of which contain mines and some of which do not.");
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Mines" + ConsoleColors.ANSI_RESET + ": Some boxes contain mines, and the player must not click on them. If you click on a mine, you lose the\n                            game. The number of mines is 10 / 40 / 99.");
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Safe spaces" + ConsoleColors.ANSI_RESET + ": The game begins with all spaces hidden. The player must click on a square to reveal it. If the\n                            revealed space does not contain a mine, it will display a number indicating how many mines are in the adjacent\n                            spaces.");
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Opening rules" + ConsoleColors.ANSI_RESET + ": If you click on an empty space without a mine, all adjacent empty spaces will be revealed until\n                            they reach a number. This can help open up large areas of the playing field safely.");
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Win" + ConsoleColors.ANSI_RESET + ": The game is won when all safe spaces have been revealed without activating any mines. The goal is to\n                            clear the playing field safely and efficiently.");
        System.out.println("                          -" + ConsoleColors.ANSI_CYAN + " Lose" + ConsoleColors.ANSI_RESET + ": The game is lost when you click on a mine.");
        System.out.println();
        System.out.println("                          " + ConsoleColors.ANSI_BLUE + "----------------------------------------------------------------------------------------------------------------" + ConsoleColors.ANSI_RESET);
    }

    public static int level() {
        int level = Input.getInteger("                                         SELECT THE LEVEL TO PLAY (1 - " + ConsoleColors.GREEN_BACKGROUND + "  EASY \uD83D\uDE00  " + ConsoleColors.ANSI_RESET + " / 2 - " + ConsoleColors.YELLOW_BACKGROUND + "  MEDIUM \uD83D\uDE08  " + ConsoleColors.ANSI_RESET + " / 3 - " + ConsoleColors.RED_BACKGROUND + "  HARD \uD83D\uDC7D  " + ConsoleColors.ANSI_RESET + " ): ");

        while (level > 3 || level < 1) {
            System.out.println("                                                                 " + ConsoleColors.ANSI_RED + "   ERROR NUMBER, WRITE 1, 2 OR 3 ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
            level = Input.getIntegerTwo("                                         SELECT THE LEVEL TO PLAY (1 - " + ConsoleColors.GREEN_BACKGROUND + "  EASY \uD83D\uDE00  " + ConsoleColors.ANSI_RESET + " / 2 - " + ConsoleColors.YELLOW_BACKGROUND + "  MEDIUM \uD83D\uDE08  " + ConsoleColors.ANSI_RESET + " / 3 - " + ConsoleColors.RED_BACKGROUND + "  HARD \uD83D\uDC7D  " + ConsoleColors.ANSI_RESET + " ): ");
        }

        System.out.println();
        System.out.println();

        return level;
    }

    public static void game(char[][] board, char[][] boardPlayer, int countMines, int level) {

        int letter, number, num;

        System.out.println();

        do {

            System.out.println("                                                                     " + ConsoleColors.BLUE_BACKGROUND + ConsoleColors.ANSI_BLACK + "  ⏬ CHOOSE AN OPTION ⏬  " + ConsoleColors.ANSI_RESET);
            System.out.println();

            if (countMines != 0) {
                num = Input.getIntegerTwo("                                                           " + ConsoleColors.ANSI_CYAN + "1" + ConsoleColors.ANSI_RESET + " - Select position  / " + ConsoleColors.ANSI_CYAN + " 2" + ConsoleColors.ANSI_RESET + " - Mark a mine (M " + ConsoleColors.ANSI_BLUE + countMines + ConsoleColors.ANSI_RESET + ") ");

                while (num > 2 || num < 1) {
                    System.out.println("                                                                 " + ConsoleColors.ANSI_RED + "   ERROR NUMBER, WRITE 1 OR 2 ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
                    num = Input.getIntegerTwo("                                                           " + ConsoleColors.ANSI_CYAN + "1" + ConsoleColors.ANSI_RESET + " - Select position  / " + ConsoleColors.ANSI_CYAN + " 2" + ConsoleColors.ANSI_RESET + " - Mark a mine (M " + ConsoleColors.ANSI_BLUE + countMines + ConsoleColors.ANSI_RESET + ") ");
                }

            } else {
                num = Input.getIntegerTwo("                                                           " + ConsoleColors.ANSI_CYAN + "1" + ConsoleColors.ANSI_RESET + " - Select position  / " + ConsoleColors.ANSI_CYAN + " 2" + ConsoleColors.ANSI_RESET + " - Mark a mine (M " + ConsoleColors.ANSI_BLUE + "0" + ConsoleColors.ANSI_RESET + ") ");

                while (num != 1) {
                    System.out.println(ConsoleColors.ANSI_RED + "                                                                           ERROR NUMBER ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
                    num = Input.getIntegerTwo("                                                           " + ConsoleColors.ANSI_CYAN + "1" + ConsoleColors.ANSI_RESET + " - Select position  / " + ConsoleColors.ANSI_CYAN + " 2" + ConsoleColors.ANSI_RESET + " - Mark a mine (M " + ConsoleColors.ANSI_BLUE + "0" + ConsoleColors.ANSI_RESET + ") ");
                }
            }

            if (level == 1) {
                String coordinate = Input.getCoordinate();

                while (Coordinate.wrongLenght(coordinate) ||
                        Coordinate.letterErrorEasy(coordinate.charAt(0)) ||
                        Coordinate.numberErrorEasy(coordinate.charAt(1)) ||
                        boardPlayer[coordinate.charAt(0) - 65][coordinate.charAt(1) - 47] != '-') {

                    System.out.println(ConsoleColors.ANSI_RED + "                                                                         COORDINATE ERROR ! \uD83D\uDE21" + ConsoleColors.ANSI_RESET);
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

                    System.out.println(ConsoleColors.ANSI_RED + "                                                                         COORDINATE ERROR ! \uD83D\uDE21" + ConsoleColors.ANSI_RESET);
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

                    System.out.println(ConsoleColors.ANSI_RED + "                                                                         COORDINATE ERROR ! \uD83D\uDE21" + ConsoleColors.ANSI_RESET);
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
                boardPlayer[letter][number] = 'M';
                countMines--;
            }

            System.out.println();
            System.out.println();

            if (level == 1) {
                System.out.println();
                Visualize.showBoardEasy(boardPlayer);
            } else if (level == 2) {
                Visualize.showBoardMedium(boardPlayer);
            } else {
                Visualize.showBoardHard(boardPlayer);
            }
            System.out.println();

        } while (!win(boardPlayer) && (!Put.collisionBomb(board, letter, number) || num == 2));

        if (Put.collisionBomb(board, letter, number) && num == 1) {

            Visualize.showBombs(board, boardPlayer);

            System.out.println("                                                                          " + ConsoleColors.RED_BACKGROUND + "  BOOOOOOM ! \uD83D\uDCA3  " + ConsoleColors.ANSI_RESET);
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
            System.out.println("                                                                 " + ConsoleColors.GREEN_BACKGROUND + "  CONGRATULATIONS, YOU WON ! \uD83C\uDFC6  " + ConsoleColors.ANSI_RESET);
            System.out.println();

            if (level == 1) {
                Visualize.removeBombsEasy(board);

            } else if (level == 2) {
                Visualize.removeBombsMedium(board);
            } else {
                Visualize.removeBombsHard(board);
            }
        }
    }


    public static boolean win(char[][] boardPlayer) {

        for (char[] chars : boardPlayer) {
            for (int j = 0; j < boardPlayer[0].length; j++) {

                if (chars[j] == '-') {
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

        if (boardPlayer[letter][number] != '-' || board[letter][number] != ' ') {
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