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

        int n=0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            n=Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(new exchanger_coins(n).number_way());

    }

}
