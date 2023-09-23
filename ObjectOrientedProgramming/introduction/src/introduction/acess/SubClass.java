package introduction.acess;

import introduction.acess.AcessModifier;

public class SubClass extends AcessModifier{

    public SubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        AcessModifier obj = new AcessModifier(11, "AryanParashar");
//        int n = obj.num; Here the num has been out as the private an dthus A as teh parent does not know abotu the chuld class/ base class ontlh base
        // class knwo wht is thw parent class so thu sit works in the same way as if the "extends AcessModifier" section is not even present int he code
        // for this file if it is talkin of the acessing the num
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(11, "AryanParashar");
        int n = obj.num;

        System.out.println(obj instanceof AcessModifier);
        //Here it checks if the obj checks if it is the obj is instance of AcessModifier or not and it will return true in this case
        System.out.println(obj instanceof SubClass);// Here it will check if the obj is an in stance of SubClass or not

        System.out.println(obj instanceof Object); // here it will check if it is an insatnce of Object class or not which will be true as every
        // class is an instance of Object class
    }
}

class SubClass2 extends AcessModifier{

    public SubClass2(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        AcessModifier obj = new AcessModifier(11, "AryanParashar");
//        int n = obj.num;

//        System.out.println(obj instanceof AcessModifier);
//        //Here it checks if the obj checks if it is the obj is instance of AcessModifier or not and it will return true in this case
//        System.out.println(obj instanceof SubClass);// Here it will check if the obj is an in stance of SubClass or not
//
//        System.out.println(obj instanceof Object); // here it will check if it is an insatnce of Object class or not which will be true as every
//        // class is an instance of Object class
    }
}


