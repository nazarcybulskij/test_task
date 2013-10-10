/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 07/10/13
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 */
public class Converter {
    public String MasktoMatcherString(String mask) {
        StringBuilder tempBuilder = new StringBuilder("");
        Character tempCharacter;
        for (int i = 0; i < mask.length(); i++) {
            tempCharacter = mask.charAt(i);
            switch (tempCharacter) {
                case '*':
                    tempBuilder.append("[^/?*:;{}\\\\]{0,}");
                    break;
                case '_':
                    tempBuilder.append("[^/?*:;{}\\\\]{1}");
                    break;
                default:
                    tempBuilder.append("[" + tempCharacter + "]{1}");
                    break;
            }


        }


        return tempBuilder.toString();
    }
}
