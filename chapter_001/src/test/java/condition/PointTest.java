package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        double expected = 1.73;
        double out = Point.distance(2, 4, 3, 4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
