package Writer;

import java.io.*;

public class CreateNewFileExample {
    public static void main(String[] args) {

        //create
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //write
        try{
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("Hare Ramaa Hare Rama");
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //reading
        try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))) { //FOR FATS INOUT FROM FILES THE CHARACTER STREAMS ARE FASTER AND THUS, FOR FASTER INPUT WE WILL HAVE TO USE THIS LINE.
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //creating and deleting the file
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName() + "got deleted");
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
