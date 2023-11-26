import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random  =new Random();

        //Here in this one we will be focussing on building up a string of size 20 and then starting up the random sloat algo to get random numbers added after 97 which is the
        // unicode for a and then after 97 comes the uncide for all the other strings and then all those characters and letters will come and get appended in the string we got
        // after a of the size 20
        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }

        return sb.toString();
    }
}
