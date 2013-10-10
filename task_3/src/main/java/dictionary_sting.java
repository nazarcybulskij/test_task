/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 09/10/13
 * Time: 11:55
 * To change this template use File | Settings | File Templates.
 */
public class dictionary_sting  {
    private final String underlyingString;

    public dictionary_sting(String underlyingString) {
        this.underlyingString = underlyingString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        dictionary_sting that = (dictionary_sting) o;

        if (underlyingString != null ? !underlyingString.equals(that.underlyingString) : that.underlyingString != null)
            return false;

        return true;
    }


}
