package Reader;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Example {     //to get the string and read the data that have been entered here in the field as
                                                // dif the string is a letter or int then it will be converted to char
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)){ //created the class and then it will take some byte data which is System.in here
            System.out.println("Enter some letters:");
            int letters = isr.read();   //then the letters is defined to some numbers lets say
            while(isr.ready()){     //defining conditions when the isr is ready and we haven't closed the process yet
                System.out.println((char) letters); //to convert the letter to char form
                letters = isr.read();   //again defining the letters to read the file
            }
//            isr.close();    //close the stream ALTHOUGH WE DOESNT HAVE TO INCLUDE IT AS THE NEW JAVA FEATRUE WILL AUTOMATICALLY CLOSE IT AS ACC. TO THE JAVA7
            System.out.println();
        } catch (IOException e) {   //will catch the IOException
            System.out.println(e.getMessage()); //if the error is catched then display the message
        }
    }
}