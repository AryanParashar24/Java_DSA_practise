package introduction.Interfaces;

public class main {

    /*
    Now we already know that the the parent dosen't know anything abt the base classes but the base classes know abt the parent classes so to give
     more functionalities and methdos to the base class the functions/methods in the abstarct classes usually get pushing up and up in the
      heirarchy table of the inheritance bt to get rid of this

      Interfaces are used to get rid of this thing and the properties and methdos stored in one of the base class of some other subclass
       can be used in some other subclass or in the base classs in the hierarchy &
        THUS HELPS IN ELIMINATING OUT THIS PROBLEM OF THIS HIERARCHY

      Now with the interfaces we can use methods stored in one of the base class in some other base class even they aren't even
       connected to each otehr at any level and even the relation goes in to a curve path

     */
    public static void main(String[] args) {

//        Car car = new Car();
//
////        car.a(); now here we can easily see that the car.a() isn't working out as a is defined in the ENgine and not in the Car class so to get it
////        done we would have to call the Engine Interface
//        car.start();
//        car.stop();

//        Media mediaControl = new Car();
//        mediaControl.stop(); //Now here as we can see we are calling the media class whci his not even containing the stop method bt then also it is
        // stopping the car instead which is very dangerous for the codebase so to get rid of this problem we can create subClasses within the
        // Interfaces

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
    }
}
