import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class MyStringBuffer {
    /* String buffer helps in creating the mutable type data in the array or in the dataset

    so if the datapoint is updated then the data object in it is being changed without creating the new object.

    String Buffer do have many Advantages as well:
    1. Mutable      : here the object with be updated without getting to change ti
    2. Efficient
    3. Thread Safe
     */

    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());  //here the default capacity of the disk is 16 for each class.

        //constructor 2
        StringBuffer sb2 = new StringBuffer("Aryan Parashar");

        //constructor 3
        StringBuffer sb3 = new StringBuffer(21);    //here in this we can edit the capacity of the class been taken in the dataset to the edited
                                                                        // capacity we wanted to be entered

        sb.append("codechill"); //this will add up the string been provided for the dataset
        sb.append(" is awesome!!");

        sb.insert(0, " Aryan ");// this will insert the given dataset in the code which can be set according to the index been entered

        sb.replace(0, 4, "AryanParashar");//here we can replace the string deciding with the indexes been entered with the string of our choice

        sb.delete(0, 12);//here we can delete the string depending on the indices been entered

        String str = sb.toString();
        System.out.println(str);

//        Random random = new Random();
//        System.out.println(random.nextFloat());
//
//        System.out.println((char)(97+1));   //here the integer 97 is being converted to the char valeu where the 97 has the value a and 98 has b as its value



        //create the appending of random letters in the single String
        int  n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);


        //remove whitespaces

        String sentence = "hds ashbdd g abds uihu ia";
        System.out.println(sentence);

        System.out.println(sentence. replaceAll("\\s", ""));

        //split
        String arr = "Aryan Parashar Jaanu";
        String[] names = arr.split(" ");    //here in this we will be storing all the keywords in the trying which comes after space
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(41.87379234));
    }
}
