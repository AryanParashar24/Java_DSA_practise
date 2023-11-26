import java.math.BigInteger;
import java.math.BigDecimal;


public class BigIntegerDecimal {

    public static void main(String[] args) {
        BD();
    }

    static void BD(){


        BigDecimal AA = BigDecimal.valueOf(2.1056832471);
        BigDecimal BB = BigDecimal.valueOf(827.3498234712347);
        BigDecimal ans = AA.multiply(BB);
        System.out.println(ans);

        //for BigDecimal
        System.out.println("For BigDecimal");
        BigDecimal ss = AA.add(BB);

        BigDecimal mm = AA.multiply(BB);

        BigDecimal sub2 = AA.subtract(BB);

        BigDecimal dd = AA.divide(BB);

        BigDecimal rem2 = AA.remainder(BB);

        BigDecimal pow = BB.pow(41);

        System.out.println(dd);

    }
    static void BI() {

        int a = 11;
        int b = 51;

        BigInteger A = BigInteger.valueOf(21);
        BigInteger B = BigInteger.valueOf(82734);   //here in this we r converting from int/long to Big integer format
        int c = B.intValue();   //here in this we r converting from Big integer format to int
        BigInteger C = new BigInteger("23874"); //btu here when we r dealing with stringas we will have to initialize em' as classes
        BigInteger X = new BigInteger("384");


        //constants
        BigInteger D = BigInteger.TEN;

        //addition
        System.out.println("for BigInteger");
        BigInteger s = C.add(X);

        BigInteger m = C.multiply(X);

        BigInteger sub = C.subtract(X);

        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);    //btu we can't include primitves in this and if we do try to then we will get an error



        if (X.compareTo(C) < 0){
            System.out.println("X is smaller than C");
        }

        System.out.println(Factorial.fact(12));

    }
}