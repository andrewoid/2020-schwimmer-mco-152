package schwimmer.projectile;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ProjectileTest {

    @Test
    public void getX() {
        // given
        Projectile projectile = new Projectile(53.26, 82);
        projectile.increaseTime(5);

        // when
        double x = projectile.getX();

        // then
        assertEquals(245.2557, x, 0.0001);
    }

    @Test
    public void getY() {
        // given

        // when

        // then
        fail("Do your homework!");
    }

}