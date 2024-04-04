package Reader;

import java.io.IOException;
import java.io.FileReader;

//So here we are taking the data ion the byte stream and then putting it in the character stream
public class FileReader_Example {
    public static void main(String[] args) {
//        try (FileReader fr = new FileReader("note.txt")){ //created the class and then it will take some byte data which is System.in here
////            System.out.println("Enter some letters:");
//            int letters = fr.read();   //this int is storing the letters and then the char below in system.out.println will be printing it in the character format otherwise the println will be printing the ASCII value of the letters
//            while(fr.ready()){     //defining conditions when the isr is ready and we haven't closed the process yet
//                System.out.println((char) letters); //to convert the letter to char form
//                letters = fr.read();   //again defining the letters to read the file
//            }
////            fr.close();    //close the stream ALTHOUGH WE DOESNT HAVE TO INCLUDE IT AS THE NEW JAVA FEATRUE WILL AUTOMATICALLY CLOSE IT AS ACC. TO THE JAVA7
//            System.out.println();
//        } catch (IOException e) {   //will catch the IOException
//            System.out.println(e.getMessage()); //if the error is catched then display the message
//        }
        try (FileReader fr = new FileReader("note.txt")){ //created the class and then it will take some byte data which is System.in here
//            System.out.println("Enter some letters:");
            int i;   //this int is storing the letters and then the char below in system.out.println will be printing it in the character format otherwise the println will be printing the ASCII value of the letters
            while((i = fr.read()) != -1){     //defining conditions when the isr is ready and we haven't closed the process yet
                if(Character.isLetter(i))
                    System.out.println((char) i); //to convert the letter to char form
//                letters = fr.read();   //again defining the letters to read the file
            }
//            fr.close();    //close the stream ALTHOUGH WE DOESNT HAVE TO INCLUDE IT AS THE NEW JAVA FEATRUE WILL AUTOMATICALLY CLOSE IT AS ACC. TO THE JAVA7
            System.out.println();
        } catch (IOException e) {   //will catch the IOException
            System.out.println("Error reading the file: " + e.getMessage()); //if the error is catched then display the message
        }
    }       //HERE IF WE WILL STORE char letters = fr.read() THEN IT WILL GIEV US AN ERROR AS IN DOCUMENTATION OF READ IT IS an int FORMAT WHERE THE DATA WILL BE STORED IN THE ASCII value
}
