package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance2() {
        Point a = new Point(0, 0);
        Point b = new Point(7, 3);
        double out = a.distance(b);
        double expected = 7.61;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point a = new Point(5, 6, 7);
        Point b = new Point(5, 8, 9);
        double out = a.distance3d(b);
        double expected = 2.82;
        Assert.assertEquals(expected, out, 0.01);
    }
}
