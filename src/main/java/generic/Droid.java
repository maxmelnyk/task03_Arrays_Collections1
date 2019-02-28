package generic;

public class Droid {
    private String color;
    private boolean fly;
    private Double speed;

    public Droid() {
    }

    public Droid(String color, boolean fly, Double speed) {
        this.color = color;
        this.fly = fly;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "color='" + color + '\'' +
                ", fly=" + fly +
                ", speed=" + speed +
                '}';
    }
}