package introduction.AbstractDemo;

public class main {

    public static void main(String[] args) {
        Son son = new Son(21);
        son.carrer();

//        abstract Parent();   you cannot have abstract constructors

        Daughter daughter = new Daughter(21);
        daughter.carrer();


        Parent.hello();
//        Parent mom = new Parent(45);  you cannot create pbjects of abstarct classes directly by this, you have to create override methods as well in the function to get it worked ou
    }
}
