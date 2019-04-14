package ru.stqa.pft.sandbox;
//прямоугольник
public class Rectangle {

    public double l;
    public double b;
    public double a;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;


    }

    public  double area(){
        return this.a * this.b;

    }
}
