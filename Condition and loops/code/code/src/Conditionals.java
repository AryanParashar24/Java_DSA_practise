public class Conditionals {

    public static void main(String[] args) {
       int salary = 67347;
//        if (salary > 1000){
//            salary = salary + 2000;
//        } else{
//            salary = salary + 1000;
//        }
        //System.out.println(salary);

        // multiple if-else
        if (salary > 10000){
            salary = salary + 2000;
        }else if(salary > 20000){
            salary = salary + 3000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
