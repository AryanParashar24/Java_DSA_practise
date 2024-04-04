package Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassReader {
    //here i f we want to create a new file in the code then we can do it via the Class Reader

    // Reader.ClassReader
    //it has the saem reader as for the fileReader and the inputStreamReader to read single byte at a time

    /* readLine
     To read the line of the text

     BufferReader
     It creates a bufferring character input stream that uses default sized input buffer.
      Here in the Buffer Reader we will see int he constructor that it will be taking the (reader in) in the parameters thus, we can't put system.in
       as Reader is a buffer type and the System is an input stream

     SO TO CONVERT THE BYTE STREAM INTO THE BUFFER TYPE i.e. THE CHARACTER TYPE WE WILL HAVE TO SUE THE InputStreamReader
     */

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

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { //Now here the InputStreamReader will be converting the BYTE stream into the

            // CHARACTER STREAM & then the BufferReader will be reading thsi character stream data.
            //So here BufferReader is a character based reader linked to your keyboard(which is a byte). Thus it is Byte-to-char-to-read
            System.out.println("You typed: " + br.readLine()); //SO instead of reading one character at a time liek wht we were doing earlier in the previous example we will be able to read the entire line now here
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))) { //FOR FATS INOUT FROM FILES THE CHARACTER STREAMS ARE FASTER AND THUS, FOR FASTER INPUT WE WILL HAVE TO USE THIS LINE.
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
