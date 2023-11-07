package model;

public class Coordinate {

    public static boolean wrongLenght(String coordinate) {
        return coordinate.length() != 2;
    }

    public static boolean letterErrorEasy(char letter) {
        return letter < 'A' || letter > 'H';
    }

    public static boolean letterErrorMedium(char letter) {
        return letter < 'A' || letter > 'N';
    }

    public static boolean numberErrorEasy(char number) {
        return number < '0' || number > '9';
    }

    public static boolean numberErrorMedium(char number) {

        return (number < '0' || number > '9') && (number < 'a' || number > 'f');
    }
}
