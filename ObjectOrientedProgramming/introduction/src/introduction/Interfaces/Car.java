package introduction.Interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("Car applies brake");
    }

    @Override
    public void start() {
        System.out.println("Car starts on starting");
    }

    @Override
    public void stop() {
        System.out.println("Car stops on applying brakes");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerates on accelerating");
    }
}
