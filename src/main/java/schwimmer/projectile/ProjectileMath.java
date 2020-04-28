package schwimmer.projectile;

import java.util.ArrayList;
import java.util.Random;

public class ProjectileMath {

    public static final int NUM_PROJECTILES = 5;

    public static void main(String[] args) {
        ArrayList<Projectile> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < NUM_PROJECTILES; i++) {
            double angleInDegrees = random.nextDouble() * 180;
            double velocity = random.nextDouble() * 100;
            list.add(new Projectile(angleInDegrees, velocity));
        }

        for (Projectile projectile : list) {
            for (int i = 0; i < 11; i++) {
                System.out.println(projectile);
                projectile.increaseTime(1);
            }
        }
    }

}
