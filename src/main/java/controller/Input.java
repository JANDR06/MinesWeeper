package controller;

import model.ConsoleColors;
import java.util.Scanner;

public class Input {

    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.print("                                                                " + ConsoleColors.ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
            System.out.println();
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int getIntegerTwo(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.print("                                                                " + ConsoleColors.ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! \uD83D\uDE21 " + ConsoleColors.ANSI_RESET);
            System.out.println();
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String getCoordinate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("                                                           " + ConsoleColors.ANSI_BLUE + "Enter a coordinate" + ConsoleColors.ANSI_RESET + " (Example 'D5' / 'd5')" + ConsoleColors.ANSI_BLUE + ": " + ConsoleColors.ANSI_RESET);
        String coordinate = sc.next();
        coordinate = coordinate.toUpperCase();

        return coordinate;
    }

    public static String getCoordinateTwo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("                                                           " + ConsoleColors.ANSI_BLUE + "Enter a coordinate" + ConsoleColors.ANSI_RESET + " (Example 'DA' / 'da')" + ConsoleColors.ANSI_BLUE + ": " + ConsoleColors.ANSI_RESET);
        String coordinate = sc.next();
        coordinate = coordinate.toUpperCase();

        return coordinate;
    }


}