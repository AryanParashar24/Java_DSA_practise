package introduction.ExceptionHandling;

public class MyException extends Exception{
    public MyException(String message){
        super(message); // as i wanted to print the messaeg on calling up this exception and catching the exception
    }
}
