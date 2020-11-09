import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tree {
    public static void main(String[] arg) throws Exception {

        try (Stream<Path> path = Files.walk(Paths.get("C:/Temp/movies"))) {
            List<String> result = path.filter(Files::isRegularFile).map(x -> {

                if (Files.isRegularFile(x)) {
                    return "\\" + x.toString();
                }

                return x.toString();
            }).collect(Collectors.toList());
            result.forEach(System.out::println);
            // result.forEach(line -> moviesFile.write(line));

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter movieFile = new FileWriter("Movies.txt");
        try {
            movieFile.write("Movie's List : ");
            // movieFile.write(result);
        } catch (Exception e) {
            System.out.println("THERE IS NO SUCH FILE !!!");
        }

        movieFile.close();
    }
}

// public class FileTree {

// private static List<String> writeFile() throws IOException {
// try (Stream<Path> path = Files.walk(Paths.get("C:/Temp/movies"))) {
// List<String> result = path.filter(Files::isRegularFile).map(x -> {

// if (Files.isRegularFile(x)) {
// return "\\" + x.toString();
// }

// return x.toString();
// }).collect(Collectors.toList());
// return result;
// }
// }

// public static void main(String[] arg) throws Exception {

// FileWriter movieFile = new FileWriter("MoviesZZZZZ.txt");
// movieFile.write("Movie's List : ");
// for (String str : result) {
// movieFile.write(str);
// }
// movieFile.close();
// }
// }