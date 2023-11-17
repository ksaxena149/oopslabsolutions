public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException for division by zero

            String str = "not a number";
            int num = Integer.parseInt(str); // This will throw NumberFormatException

            String str2 = "hello";
            char ch = str2.charAt(10); // This will throw StringIndexOutOfBoundsException

            int[] arr = new int[5];
            int value = arr[10]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (Exception e) {
            System.out.println("Exception encountered");
        }
    }
}