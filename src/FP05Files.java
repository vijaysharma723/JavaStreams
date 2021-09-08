import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {

    public static void main(String[] args) throws IOException {

        /*
        *
        * In this we are reading the file and printing all the distinct values present after splitting each word
        *
        * */
        Files.lines(Paths.get("testfile.txt")) /*This is used to read Lines from file*/
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct().sorted().forEach(System.out::println);

                /*
                *
                * will print all files and directories present in root of this project
                *
                * */

                Files.list(Paths.get("."))
                        .filter(Files::isDirectory)
                        .forEach(System.out::println);
    }
}
