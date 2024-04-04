package Writer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class OutputStreamWriterExample {
    /*OutputStreamWriter is one of the type of Writer in which act as the bridge to convert the character stream to byte stream.

    HERE IN THE OutputStreamWriter there are 4 methods:
    1)   flush
    2)   close
    3)   getEncoding
    4)   write (here in the write method has 4 variations and this variations i called as we learnt earlier is function overloading)
     */

    public static void main(String[] args) {
        OutputStream os = System.out; //because it will be giving output on the console through System.out
//        os.write(🚀);
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello world");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
//            os.write(🚀);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
