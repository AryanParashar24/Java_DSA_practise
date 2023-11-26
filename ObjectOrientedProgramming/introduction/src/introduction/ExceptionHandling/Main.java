package introduction.ExceptionHandling;

/*
There are mostly two types in the OOPS one is ERROR and another one is EXCEPTION, lets break it down to the detailed version:


            Error is a condition in which we cannot change anything its, the final output got in the program which tells out the output which aren't
             possible to handled or changed. For Example: Stack Overflow

            Exception on the another hand is a condition in which some arithmetic or code errors are pointed out which aren't possible to exist like
             dividing a number with 0 wouldn't giev any result and will flag out an exception


                                                    Object Type
                                                        |
                                                        |
                                                        |
                                                   Throwable Type
                                                        |
                                                        |
                                    -------------------------------------------
                                    |                                         |
                                    |                                         |
                                Exception                                   Errors
                                    |
                                    |
                             ----------------
                             |              |
                             |              |
                          Checked        Unchecked




                 Checked type Exception is the one which is being flagged out or occurred while the compilation time. For example, you are trying to
                  open some file and the file does not exist then it will give an exception at the compile time that the file does not exist

                  Unchecked Exception handling on the other hand i sa type of exception which i sunable to be flagged by the compiler so can't be
                   founded out or flagged while the comilation si goign on so the Unchecked Exceptional Handling takes place.
                  For Example: Dividing by 0 whihc is a arithmetic eception
 */

public class Main {

    public static void main(String[] args) {
        int a= 10;
        int b = 0;
//        int c = a/b;
//        System.out.println(c);
        //Here it will be running and giving an arithmetic exception which is a part of runtime exception which is a subclass of Exception

        try{                //try anything but catching would be done in the catch part
//            divide(a, b);

            String name = "Aryan";
            if(name.equals("Aryan")){
                throw new MyException("name is Aryan");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){    //Here in this function we are taking the exception to be printed in the console after try with c and then catching it
                                // to print the message
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("here we have the Exception");
        }finally{   //Here also one of the thing being noticed is that the more restricted one should be placed forst as once the exception is being
                    // thrown then after if another exception comes which is placed afterwards and it is a subpart of one of the exception that is
                    //being used earlier,so it is better to put the more restricted type Exception first in the order of the file for handling exceptions

            System.out.println("this will always execute"); //no matter wht happens this will alwasy happen
        }

    }

    static int divide(int a, int b) throws Exception {
        if (b==0){
            throw new Exception("please do not divide by zero");
        }       //Now here in this case we would see that an exception would be thrown as the exception is being noticed when running the divide function
                // in the starting of the funtion and then it would be catched by the catch function in the function

        return a/b;
    }
}
