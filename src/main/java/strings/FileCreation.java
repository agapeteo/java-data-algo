package strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class FileCreation {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1, 5000).forEach(i -> createTmpFile(i));
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }

    private static void createTmpFile(int number){
        try {
            Path newPath = Files.createTempFile("cached-", number + ".json");
            Files.write(newPath, new Integer(number).toString().getBytes() );
//            System.out.println("created: " + newPath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
