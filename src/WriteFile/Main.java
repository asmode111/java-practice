package WriteFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 4 popular options
        // FileWriter is good for small or medium-sized text files
        // BufferWriter is better performance for large amounts of text
        // PrintWriter is best for structured data, like reports or logs.
        // FileOutputStream is best for binary files like images, audio files

        processFileWriter();
    }

    private static void processFileWriter() {

        Random random = new Random();
        String filePath = "./src/WriteFile/test.txt";

        // try(FileWriter writer = new FileWriter(filePath)) { -> Advantages of Try-With-Resources
        // No need for close() (automatic resource management).
        // Handles exceptions properly, even if an exception is thrown.
        // Prevents resource leaks.
        // Cleaner and more readable code.
        try(FileWriter writer = new FileWriter(filePath)) {
            String content = getContent(random);
            writer.write(content);

            System.out.println("Files is written.");
        } catch(FileNotFoundException e) {
            System.out.println("Cannot locate the file location.");
        } catch(IOException e) {
            System.out.println("Cannot write the file.");
        }
    }

    private static String getContent(Random random) {
        if (true) {
            int randomNumber = random.nextInt(0, 100);
            return Integer.toString(randomNumber);
        }

        return """
            abcd
            defg
            hijk
        """;
    }
}
