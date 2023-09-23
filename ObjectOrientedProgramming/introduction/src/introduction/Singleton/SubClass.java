package introduction.Singleton;

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
    }
}

class SubClass2 extends AcessModifier{

    public SubClass2(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        AcessModifier obj = new AcessModifier(11, "AryanParashar");
//        int n = obj.num;

        System.out.println(obj instanceof AcessModifier);
    }
}


