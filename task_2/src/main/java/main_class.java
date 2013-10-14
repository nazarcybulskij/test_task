import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 07/10/13
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class main_class {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<File> print_list = FindFile.SearchByMask(reader.readLine(), new File(reader.readLine()));
            for (File temp : print_list) {
                System.out.println(temp.getAbsoluteFile());

            }

        }


    }
}
