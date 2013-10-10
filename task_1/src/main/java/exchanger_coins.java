import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 10/10/13
 * Time: 09:37
 * To change this template use File | Settings | File Templates.
 */
public class exchanger_coins {
    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    private int counts;

    public exchanger_coins(int counts) {
        this.counts = counts;
    }

    public long number_way() {

        if (counts<0){
            throw new invalidCountsException(String.valueOf(counts));
        }
        if (counts>30000){
            throw new invalidCountsException(String.valueOf(counts));
        }



        int[] v = new int[6];
        v[0] = 1;
        v[1] = 2;
        v[2] = 5;
        v[3] = 10;
        v[4] = 25;
        v[5] = 50;

        long[][] d = new long[6][30001];

        d[0][0] = 1;

        for (int i = 0; i < 30000; i++)
            for (int j = 0; j < 6; j++)
                for (int k = j; k < 6; k++)
                    if (i + v[k] <= 30000)
                        d[k][i + v[k]] += d[j][i];

        int n = counts;


        long ans = 0;
        for (int i = 0; i < 6; i++)
            ans += d[i][n];

        return ans;


    }
}

