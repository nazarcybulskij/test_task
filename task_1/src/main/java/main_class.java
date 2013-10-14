import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 07/10/13
 * Time: 14:55
 * To change this template use File | Settings | File Templates.
 */
public class main_class {
    public static void main(String[] args) {

        int n =0;
        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                n = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        System.out.println(new exchanger_coins(n).number_way());

    }

}
