package controller;

import model.Console;
import java.util.Scanner;

public class Input {

    /**
     *
     * @param message Message that arrives asking for an integer
     * @return Returns an integer
     */
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.print("                                                                " + Console.ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! \uD83D\uDE21 " + Console.ANSI_RESET);
            System.out.println();
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     *
     * @param message Message that arrives asking for an integer
     * @return Returns an integer
     */
    public static int getIntegerTwo(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.print("                                                                " + Console.ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! \uD83D\uDE21 " + Console.ANSI_RESET);
            System.out.println();
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     *
     * @return Returns a coordinate as a String
     */
    public static String getCoordinate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("                                                           " + Console.ANSI_BLUE + "Enter a coordinate" + Console.ANSI_RESET + " (Example 'D5' / 'd5')" + Console.ANSI_BLUE + ": " + Console.ANSI_RESET);
        String coordinate = sc.next();
        coordinate = coordinate.toUpperCase();

        return coordinate;
    }

    /**
     *
     * @return Returns a coordinate as a String
     */
    public static String getCoordinateTwo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("                                                           " + Console.ANSI_BLUE + "Enter a coordinate" + Console.ANSI_RESET + " (Example 'DA' / 'da')" + Console.ANSI_BLUE + ": " + Console.ANSI_RESET);
        String coordinate = sc.next();
        coordinate = coordinate.toUpperCase();

        return coordinate;
    }


}