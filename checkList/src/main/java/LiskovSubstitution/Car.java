package LiskovSubstitution;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

   public Engine turnOnEngine() {

        return Engine.ON;
    }

    public void accelerate() {

    }
}
