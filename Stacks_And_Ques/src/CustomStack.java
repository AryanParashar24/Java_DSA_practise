public class CustomStack {

    protected int[] data;

    //Here we have used private so as tp make it private to this document only and static to does not allow anyone else to make changes to it and then
    // final to stop us as well from making any changes to it as well by us
    private static final int Default_Size = 10;
//    protected boolean isFull;

    int ptr = -1;



    // here this keyword will look for the changes from the class having an i nt as in its argument as in CustomStack as the Default_Size is also
    // int as specified ion the above condition
    public CustomStack(){
        this(Default_Size);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        // DON'T WRITE THE isEmpty FUNCTION HERE IN THE PUSH AS IF U WILL BE PUSHIGN THE FIRST VALUE IT WILL BE SHOWING EMPTY INT HE STACK AND WILL RETURN
        // FALSE AND TERMINATE THE RUNNIGN CODE AND NT ENTER THE VALUE SAME WILL HAPPEN NEXT TIME AS WELL SO INSTEAD OF PUSHING THE VALUES THE MESSAGE
        // OF ARRAY IS EMPTY WILL APPEAR FOR THE NUMBER OF TIMES U HAVE COMMANDED TO PUSH THE VALUES IN CODE

//        if(isEmpty()){
//            System.out.println("Array is empty");
//            return false;
//        }

        if (isFull()){
            System.out.println("Array is already full");
            return false;
        }

        ptr ++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek through the Empty Stack");
        }

//            int removed = data[ptr];
//            ptr --;
//            return removed;

        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot throw a peek though an Empty Stack");
        }

        return data[ptr];
    }

    protected boolean isFull(){
        return ptr == data.length - 1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
}
