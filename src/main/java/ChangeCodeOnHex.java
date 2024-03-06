import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ChangeCodeOnHex {
    public static void main(String[] args) throws FileNotFoundException {
        ChangeCodeOnHex changeCodeOnHex = new ChangeCodeOnHex();
        changeCodeOnHex.readFileAndConvert("fileName.txt");
    }
    public void readFileAndConvert(final String fileName) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {

            fileLines.
                    flatMapToInt(String::chars)

                    .forEach(ch -> {

                        String hex = "";

                        if (ch == '\t') {
                            hex = "HT";
                        } else if (ch == '\n') {
                            hex = "LF";
                        } else if (ch == '\f') {
                            hex = "FF";
                        } else if (ch == '\r') {
                            hex = "CR";
                        } else if (ch > 127) {
                            hex = "<U+"+Integer.toHexString(ch)+">";
                        } else {
                            hex = Integer.toHexString(ch);
                        }
                        System.out.println(hex);
                    });
        } catch (Exception exception) {
            throw new FileNotFoundException(exception.toString());
        }
    }
}
