import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args) {
        try {
            readFile("thisfiledoesntexist.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
