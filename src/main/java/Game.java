public class Game {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String ANSI_BLACK = "\u001B[30m";


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        System.out.println();
        System.out.println();
        System.out.println("                                                                 " + BLUE_BACKGROUND + ANSI_BLACK + "  WELCOME TO THE MINESWEEEPER !  " + ANSI_RESET);
        System.out.println();
        int number = Get.getInteger("                                                        SELECT WHAT YOU WANT TO DO (" + ANSI_CYAN + "1" + ANSI_RESET + " - PLAY  / " + ANSI_CYAN + " 2" + ANSI_RESET + " - EXIT): ");

        while (number > 2 || number < 1) {
            number = Get.getInteger("                                                                  " + Get.ANSI_RED + "¡¡ ERROR NUMBER, WRITE 1 OR 2 !! " + ANSI_RESET);
        }

        if (number == 1) {
            instructions();
            System.out.println();

            char[][] board = new char[9][11];
            char[][] boardPlayer = new char[9][11];

            game(board, boardPlayer);

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
        System.out.println("                          -" + ANSI_CYAN + " Mines" + ANSI_RESET + ": Some boxes contain mines, and the player must not click on them. If you click on a mine, you lose the\n                            game. The number of mines is 10.");
        System.out.println("                          -" + ANSI_CYAN + " Safe spaces" + ANSI_RESET + ": The game begins with all spaces hidden. The player must click on a square to reveal it. If the\n                            revealed space does not contain a mine, it will display a number indicating how many mines are in the adjacent\n                            spaces.");
        System.out.println("                          -" + ANSI_CYAN + " Opening rules" + ANSI_RESET + ": If you click on an empty space without a mine, all adjacent empty spaces will be revealed until\n                            they reach a number. This can help open up large areas of the playing field safely.");
        System.out.println("                          -" + ANSI_CYAN + " Win" + ANSI_RESET + ": The game is won when all safe spaces have been revealed without activating any mines. The goal is to\n                            clear the playing field safely and efficiently.");
        System.out.println("                          -" + ANSI_CYAN + " Lose" + ANSI_RESET + ": The game is lost when you click on a mine.");
        System.out.println();
        System.out.println("                          " + ANSI_BLUE + "----------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
    }

    public static void game(char[][] board, char[][] boardPlayer) {

        Initialize.initializePlayerBoard(board);
        Initialize.initializePlayerBoard(boardPlayer);

        Put.putBombs(board);
        Put.putNumbers(board);

        Visualize.showBoard(board);
        System.out.println();

        Visualize.showBoard(boardPlayer);
        System.out.println();

        int letter, number, num, countMines = 10;

        do {

            System.out.println(ANSI_BLUE + "* CHOOSE AN OPTION *" + ANSI_RESET);

            if (countMines != 0) {
                System.out.println(ANSI_CYAN + "1" + ANSI_RESET + " - Select position");
                num = Get.getIntegerBelow(ANSI_CYAN + "2" + ANSI_RESET + " - Mark a mine (Mine counter: " + ANSI_BLUE + countMines + ANSI_RESET + ")");

                while (num > 2 || num < 1) {
                    num = Get.getIntegerBelow(Get.ANSI_RED + "¡¡ ERROR NUMBER, WRITE 1 OR 2 !!" + ANSI_RESET);
                }

            } else {
                num = Get.getIntegerBelow(ANSI_CYAN + "1" + ANSI_RESET + " - Select position");

                while (num != 1) {
                    num = Get.getIntegerBelow(Get.ANSI_RED + "¡¡ ERROR NUMBER !!" + ANSI_RESET);
                }
            }


            System.out.println();

            String coordinate = Get.getCoordinate();

            while (Coordinate.wrongLenght(coordinate) ||
                    Coordinate.letterError(coordinate.charAt(0)) ||
                    Coordinate.numberError(coordinate.charAt(1)) ||
                    boardPlayer[coordinate.charAt(0) - 65][coordinate.charAt(1) - 47] != '-') {

                System.out.println(ANSI_RED + "¡¡ COORDINATE ERROR !!" + ANSI_RESET);
                coordinate = Get.getCoordinate();
            }

            System.out.println();

            letter = coordinate.charAt(0) - 65;
            number = coordinate.charAt(1) - 47;

            if (num == 1) {

                boardPlayer[letter][number] = board[letter][number];

            } else {
                boardPlayer[letter][number] = 'M';
                countMines--;
            }

            Visualize.showBoard(boardPlayer);
            System.out.println();

        } while (!Put.collisionBomb(board, letter, number) || num == 2);

        if (Put.collisionBomb(board, letter, number)) {
            System.out.println("¡¡¡ BOOOOOOM !!!");
        }

    }
}