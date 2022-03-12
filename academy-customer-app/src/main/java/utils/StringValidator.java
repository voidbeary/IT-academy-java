package utils;

public class StringValidator {
    public static boolean isValidString(String string) {
        return string != null && !string.trim().isEmpty();
    }
}
