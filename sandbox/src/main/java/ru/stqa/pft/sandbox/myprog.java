package ru.stqa.pft.sandbox;

public class myprog {

	public static void main(String[] args) {
		//String somebody = "world";
		//hello();
		hello("world");
		hello("user");
		hello("Alexei");
		double l = 5
		System.out.println("Площадь квадрата со стороной" + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("ПЛощадь прямоугольника со стороной " + a + "и" + b + "=" + area(l));

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
	public static double area(double len) {
		 return len * len;

 }
 	public static double area(double a, double b) {






	}
}

