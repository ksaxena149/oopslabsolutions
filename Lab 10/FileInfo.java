import java.io.File;
import java.util.Scanner;

public class FileInfo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the file name:");
    String fileName = sc.nextLine();
    File file = new File(fileName);

    System.out.println("Exists: " + file.exists());
    System.out.println("Readable: " + file.canRead());
    System.out.println("Writable: " + file.canWrite());
    System.out.println("Type of file: " + (file.isFile() ? "File" : "Not a File"));
    System.out.println("Length: " + file.length() + " bytes");
    sc.close();
  }
}