package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }



    public double distance(Point point) {
        return  Math.sqrt((this.y-point.y)*(this.y-point.y)+(point.x-this.x)*(point.x-this.x)) ;
    }
}