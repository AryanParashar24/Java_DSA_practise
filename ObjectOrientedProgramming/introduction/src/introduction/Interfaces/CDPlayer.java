package introduction.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Start playign the CD Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop playign the CD Player");
    }
}
