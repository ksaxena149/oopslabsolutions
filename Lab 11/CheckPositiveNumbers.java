import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class CheckPositiveNumbers {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num > 0) {
                    throw new PositiveNumberException("Positive number found: " + num);
                }
            }
            System.out.println("No positive numbers found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
