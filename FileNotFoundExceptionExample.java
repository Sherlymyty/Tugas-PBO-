import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("file_tidak_ada.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
