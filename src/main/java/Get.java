import java.util.Scanner;

public class Get {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static int getIntegerBelow(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while(!sc.hasNextInt()){
            System.out.println(ANSI_RED + "¡¡ ERROR, WRITE A INTEGER NUMBER !! " + ANSI_RESET);
            sc.next();
        }
        return sc.nextInt();
    }

    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.print("                                                                 " + ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! " + ANSI_RESET);
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
            System.out.print("                                                                 " + ANSI_RED + "   ERROR, WRITE A INTEGER NUMBER ! " + ANSI_RESET);
            System.out.println();
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String getCoordinate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("                                                    " + ANSI_BLUE + "Enter a coordinate" + ANSI_RESET + " (Example 'D5' / 'd5')" + ANSI_BLUE + ": " + ANSI_RESET);
        String coordinate = sc.next();
        coordinate = coordinate.toUpperCase();

        return coordinate;
    }
}