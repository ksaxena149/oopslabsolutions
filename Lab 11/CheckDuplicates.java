import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class CheckDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter integer " + (i + 1) + ":");
                int num = sc.nextInt();
                if (!set.add(num)) {
                    throw new DuplicateNumberException("Duplicate number: " + num);
                }
                sc.close();
            }
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}