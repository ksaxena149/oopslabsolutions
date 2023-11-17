import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        String filePath = "student.txt";
        deleteFileOrDirectory(filePath);
    }

    public static void deleteFileOrDirectory(String filePath) {
        File file = new File(filePath);
        boolean isDeleted = file.delete();
        if (isDeleted) {
            System.out.println("File/directory was successfully deleted.");
        } else {
            System.out.println("File/directory does not exist.");
        }
    }
}