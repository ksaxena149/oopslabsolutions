import java.io.File;

public class ListFiles {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File dir = new File(currentDir);
        listFiles(dir);
    }

    public static void listFiles(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFiles(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}