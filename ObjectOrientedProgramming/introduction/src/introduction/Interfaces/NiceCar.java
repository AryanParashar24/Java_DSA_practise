package introduction.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media musicplayer = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start(); //Now if the Engine selected in it is PowerEngien than it will call PowerEngine start otherwise that of Electric Engine
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        musicplayer.start();    // Now here unlike the example we took in the Engine class here in this one we will be having our music class
                                // getting started for the correct format unlike the previous time
    }
    public void upgradeEnguine(Engine engine){
        this.engine = engine;   //it change whtever the engien we ve choosed wheather its a power or an electric on either
//        this.engine = new ElectricEngine(); to change to electric engien btu also to do this you will have to delete the parameter in this function
    }
}
