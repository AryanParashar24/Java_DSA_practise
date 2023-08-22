public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();  // will look for the class in the parent class which dosen't have any data type in the argument
    }

    public DynamicStack(int size){
        super(size);  //it will call the CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        //this takes care of being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;

            // here in the code when the data will be collected and if the another push is being requesetd out of its length then the older data will
            // be copied to the new array called temp having double the length of the data array and then later temp will be given top the datat and
            // thus the earlier array which was being copied will be collected by the garbage collector & same will happen with temp as well (not with
            // the array which being given from temp to data) but only with the word temp as temp doesn't remain to have anything left with itself.
            // and thu sby this temp would said to be kicked out of the scope.
        }

        //at this point we know taht the array isn't full and we need to fill data in the new array formed
        //insert item
        return super.push(item);
    }
}
