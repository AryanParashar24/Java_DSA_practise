package introduction.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngien Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerated");
    }
}
