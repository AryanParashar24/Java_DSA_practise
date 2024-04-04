package Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileWriterExample {
    /*So the FileWriter is just like the Filereader as for the reader Stream where we can write characters in the file

    FileWriter DOESNT OVERRIDE THE PUBLIC METHODS BUT INSTEAD IT INHERITS FROM THE SUPER CLASS: OutputStreamWriter
     */
    public static void main(String[] args) {
        OutputStream os = System.out;

//        try(FileWriter fw = new FileWriter("note.txt")){    //This will overwrite the original note.txt file so when we will open it we will find them overwrited
        try (FileWriter fw = new FileWriter("note.txt", true)){     //"TRUE" will append the already existing text in the original note.txt file
            fw.write(" Heyooooo");  //now if you will look in the note.txt original file then we will find that the
                                                                // file has been overwrited with the name (hello world, my name is Aryan)
           }catch(IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
