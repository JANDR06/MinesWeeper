package model;

public class Coordinate {

    /**
     *
     * @param coordinate Coordinate that the user writes in the form of String
     * @return Returns false if the coordinate has a length other than 2 and true if it is equal to 2
     */
    public static boolean wrongLenght(String coordinate) {
        return coordinate.length() != 2;
    }

    /**
     *
     * @param letter First character of the coordinate entered by the user
     * @return Returns false if the character is less than the character 'A' or greater than the character 'H' and true if it is within
     */
    public static boolean letterErrorEasy(char letter) {
        return letter < 'A' || letter > 'H';
    }

    /**
     *
     * @param number Second character of the coordinate entered by the user
     * @return Returns false if the character is less than the character '0' or greater than the character '9' and true if it is within
     */
    public static boolean numberErrorEasy(char number) { return number < '0' || number > '9'; }

    /**
     *
     * @param letter First character of the coordinate entered by the user
     * @return Returns false if the character is less than the character 'A' or greater than the character 'N' and true if it is within
     */
    public static boolean letterErrorMedium(char letter) {
        return letter < 'A' || letter > 'N';
    }

    /**
     *
     * @param letter Second character of the coordinate entered by the user
     * @return Returns false if the character is less than the character 'A' or greater than the character 'P' and true if it is within
     */
    public static boolean letter2ErrorMedium(char letter) {
        return letter < 'A' || letter > 'P';
    }

    /**
     *
     * @param letter First character of the coordinate entered by the user
     * @return Returns false if the character is less than the character 'A' or greater than the character 'T' and true if it is within
     */
    public static boolean letterErrorHard(char letter) {return letter < 'A' || letter > 'T';}

    /**
     *
     * @param letter Seccond character of the coordinate entered by the user
     * @return Returns false if the character is less than the character 'A' or greater than the character 'X' and true if it is within
     */
    public static boolean letter2ErrorHard(char letter) {
        return letter < 'A' || letter > 'X';
    }

}
