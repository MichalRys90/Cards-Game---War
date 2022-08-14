import java.util.Random;

public class Cards {

    private int value;
    private int color;
    private boolean scarcity;
    Random random = new Random();

    public Cards(int value, int color, boolean scarcity) {
        this.value = value;
        this.color = color;
        this.scarcity = scarcity;
    }

    public Cards() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isScarcity() {
        return scarcity;
    }

    public void setScarcity(boolean scarcity) {
        this.scarcity = scarcity;
    }

    public int generateValue() {
        return random.nextInt(10) + 1;
    }

    public int generateColor() {
        return random.nextInt(4) + 1;
    }

    public boolean generateScarcity() {
        return random.nextBoolean();
    }
}
