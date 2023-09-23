package introduction.AbstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
//        this.age = age;
    }
    @Override
    void carrer() {
        System.out.println("I wan to become a Scientist");
    }

    @Override
    void parter() {
        System.out.println("I love Tom Hiddleston");
    }
}
