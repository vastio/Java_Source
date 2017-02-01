/**
 * Created by seba on 01/02/17.
 */

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.io.*;
import java.math.BigInteger;


public class Mersenne {

    public static void main(String args[]) {

        BigInteger starting_exp = getStartingExp();

        System.out.println("\n[*] Program starting...");
    } /*-*/



    // Recupera il primo numero da cui partire
    private static BigInteger getStartingExp() {

        BigInteger exp;
        File file = new File("./lastexp.txt");

        exp = new BigInteger("1");

        if (file.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                int ch;
                String num= "";
                while ((ch = br.read()) != -1)
                    num += ch;

                br.close();

                exp = new BigInteger(num);
            }
            catch (IOException ex) {
                System.out.println("IOException");
                System.exit(1);
            }
        }

        return exp;
    } /*-*/
}
