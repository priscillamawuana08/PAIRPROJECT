package LiskovSubstitution;

public class MotorCar extends Car {


    public MotorCar(Engine engine) {
        super(engine);
    }

    @Override
    public Engine turnOnEngine() {
        return super.turnOnEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }
}
