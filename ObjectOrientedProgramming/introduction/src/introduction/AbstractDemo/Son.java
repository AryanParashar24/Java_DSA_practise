package introduction.AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
//        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrer() {
        System.out.println("I am gonna become coder");
    }

    @Override
    void parter() {
        System.out.println("I love Millie Bobby Brown");
    }
}
