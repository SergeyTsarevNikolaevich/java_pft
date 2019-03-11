package ru.stqa.pft.sandbox;

public class myprog1 {

	public static void main(String[] args) {
		//String somebody = "world";
		//hello();
		//hello("world");
		//hello("user");
		//hello("Alexei");



		Square s = new Square(5);
		s.l = 5;
		double l = 5;
		System.out.println("Площадь квадрата со стороной" + s.l + " = " + area(s));


		Rectangle r = new Rectangle(4, 6);
		r.a = 4;
		r.b = 6;
		System.out.println("ПЛощадь прямоугольника со стороной " + r.a + "и" + r.b + "=" + area(r));

		//int l = 8;  //int переменная только для целых чисел
		//double l = 8.0; (double переменная с плавающей точкой)
		//t s = l * l;
		//double s = l*l;
		//stem.out.println("Площадь квадрата состороной" + l + "=" + s);
	}

	public static void hello(String somebody) {
		//String somebody = "world"
		System.out.println("hello" + somebody + "!");
	}

	public static double area(Square s) {
		return s.l * s.l;

	}

	public static double area(Rectangle r){
		return r.a * r.b;

	}
}

	//public static void area(double a, double b) {


