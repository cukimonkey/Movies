import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

     // Read and display movies
        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNextLine()) {
            String movies = fileScanner.nextLine();
            System.out.println(movies);
        }

    }
}
