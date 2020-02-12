package schwimmer.projectile;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Projectile {

    public static final double EARTH_GRAVITY = 9.8;

    private final double angle;
    private final double velocity;
    private double time;

    public Projectile(double angleInDegrees, double velocity) {
        this.angle = Math.toRadians(angleInDegrees);
        this.velocity = velocity;
    }

    public void increaseTime(double delta) {
        time += delta;
    }

    @Override
    public String toString() {
        return time + ":(" +
                String.format("%.4f", getX()) + ", " +
                String.format("%.4f", getY()) + ")";
    }

    public double getX() {
        return velocity * cos(angle) * time;
    }

    public double getY() {
        return velocity * sin(angle) * time - EARTH_GRAVITY * time * time;
    }

}
