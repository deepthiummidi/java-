import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter a = new FileWriter("test2.txt");
            a.write("Hello, this is file writing in Java!");
           a.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}