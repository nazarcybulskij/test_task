import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 07/10/13
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class Validator {

    public boolean isValidMask(String mask){

        Pattern pattern=Pattern.compile("([^/?*:;{}\\\\]{0,}[*]{1}[_]{1}[^/?*:;{}\\\\]{0,}){1,}");
        Matcher matcher =pattern.matcher(mask);
        if (matcher.matches()) {
            return  false;
        }
        pattern=Pattern.compile("([^/?*:;{}\\\\]{0,}[_]{1}[*]{1}[^/?*:;{}\\\\]{0,}){1,}");
        matcher =pattern.matcher(mask);
        if (matcher.matches()) {
            return  false;
        }

       /* pattern=Pattern.compile("[\\wа-яА-Я|_|*]{1,}[.]{1}[\\w]{1,}");
        matcher =pattern.matcher(mask);
        if (!matcher.matches()) {
            return  false;

        }
         /*
        pattern=Pattern.compile("[\\wа-яА-Я|_|*]{1,}[.]{1}[\\w]{1,}");
        matcher =pattern.matcher(mask);
        if (!matcher.matches()) {
            return  false;

        }

           */

        return true;
    }
}
