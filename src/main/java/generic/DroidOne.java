package generic;

public class DroidOne extends Droid{
    private String health;

    public DroidOne() {
    }

    public DroidOne(String color, boolean fly, Double speed, String health) {
        super(color, fly, speed);
        this.health = health;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
