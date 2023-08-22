public class CustomQueue{
    protected int[] data;

    private static final int DEFUALT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFUALT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isEmpty()){
            return false;
        }
        data[end++] = item;
        //here end++ means it will perform its function and then will increase the value but if it would have been ++end then it would have first
        // increased the value of end and then would have performed the function
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        // Shift the items by 1 from the second index towards the first ones
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }


    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
