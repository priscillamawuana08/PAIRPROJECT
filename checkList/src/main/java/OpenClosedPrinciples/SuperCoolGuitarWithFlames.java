package OpenClosedPrinciples;

public class SuperCoolGuitarWithFlames extends Guitar{
    private String flameColor;
// a constructor matching the Super class which is the Guitar
    public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
        super(make, model, volume);
        this.flameColor = flameColor;
    }
// getters and setters
    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
