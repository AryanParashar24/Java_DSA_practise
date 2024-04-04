package Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample{
    /*
    BufferedWriter writes text to the character-output stream, buffering characters so as to provide writing of single characters, arrays and strings.
    IT WILL ALSO HAVE THREE TYPES

     newLine
     WE DOES HAVE THIS FEATURE AS A LINE SEPERATOR WHICH CAN HELP IN SEPERATING THE LINE INSTEAD OF HAVING TO WRITE /n everytime
     */
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){     //"TRUE" will append the already existing text in the original note.txt file
            bw.write(" Haree Krishna  Raadhe Raadhe");
        }catch(IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
