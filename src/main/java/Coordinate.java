public class Coordinate {

    public static boolean wrongLenght(String coordinate) {
        return coordinate.length() != 2;
    }

    public static boolean letterError(char letter) {
        return letter < 'A' || letter > 'H';
    }

    public static boolean numberError(char number) {
        return number < '0' || number > '9';
    }
}
