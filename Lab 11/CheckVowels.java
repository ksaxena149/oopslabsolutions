class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class CheckVowels {

    public static void main(String[] args) {
        try {
            checkVowels("test");
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkVowels(String str) throws NoVowelException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelException("No vowels found in string: " + str);
        }
    }
}