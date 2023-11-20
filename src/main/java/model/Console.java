package model;

public class Console {

    // BACKGROUND COLORS
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String GREY_BACKGROUND = "\u001B[47m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";

    // FONT COLORS
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLACK = "\u001B[30m";


    /**
     * Method that shows an animation before discovering the cell
     */
    public static void simulateLoading() {
        System.out.print(Console.ANSI_PURPLE + "                                                                           Discovering");

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(380);
                System.out.print(".");
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Console.ANSI_RESET);
    }

}
