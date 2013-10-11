import org.apache.commons.lang.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 09/10/13
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */
public class Comporator {


    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    private  String one;

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    private  String two;

    public Comporator(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public boolean isCompare(){
        String []one_array=one.split(" ");
        String []two_array=two.split(" ");
        for (String temp:one_array) {
            temp.trim();

        }
        for (String temp:two_array){
            temp.trim();

        }

        for (int i=0;i<one_array.length;i++){
            one_array[i]=one_array[i].toLowerCase();
        }
        for (int i=0;i<two_array.length;i++){
            two_array[i]=two_array[i].toLowerCase();
        }
         for (String  iter_cons:one_array){

             boolean label=false;
             for (String iter_dist:two_array){
                if (equals_method(iter_cons,iter_dist)){
                    label=true;
                    break;
                }


             }

             if (label==false){
                 return false;
             }
         }

        return true;
    }

    private boolean equals_method(String str1,String str2){

        //  тут можу бути будь яка реалізація метода     (потім щось придумаємо , щоб зробити Advanced)
         StringUtils stringUtils=new StringUtils();

        int threshold=(int)((str1.length()+str2.length())/5.0);
        //System.out.println(threshold+"  "+StringUtils.getLevenshteinDistance(str1,str2));

        if (threshold>=StringUtils.getLevenshteinDistance(str1,str2))
            return  true;
        else
            return false;

      /*  if (str1.equals(str2)){
            return  true;

        }
        return false;
                                 */

    }
}
