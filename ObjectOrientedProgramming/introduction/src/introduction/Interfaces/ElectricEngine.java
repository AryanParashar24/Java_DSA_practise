package introduction.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stops");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerated");
    }
}
