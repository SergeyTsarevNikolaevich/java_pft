package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class testPoint {
    @Test
    public void testDistance(){

        Point p1 = new Point (4, 5);
        Point p2 = new Point (5, 6);

        double distanceBetweenPoints=p1.distance(p2);
        double distance = 2;
        Assert.assertEquals(distanceBetweenPoints, distance, "расстояния не равны ");
        //Assert.assertNotEquals(distanceBetweenPoints,distance,"расстояния  равны");
    }
}
