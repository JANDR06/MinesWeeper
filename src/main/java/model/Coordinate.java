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

    public static boolean letter2ErrorMedium(char letter) {
        return letter < 'A' || letter > 'P';
    }

    public static boolean letterErrorHard(char letter) {
        return letter < 'A' || letter > 'T';
    }

    public static boolean letter2ErrorHard(char letter) {
        return letter < 'A' || letter > 'X';
    }

    public static boolean numberErrorEasy(char number) {
        return number < '0' || number > '9';
    }

}
