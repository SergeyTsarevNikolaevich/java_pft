package ru.stqa.pft.sandbox;


public class myprog1 {

    public static void main(String[] args) {

       Point p1 = new Point(1,6);
       Point p2 = new Point(9,8);

       System.out.println("Расстояние между точками p1 и  p2 " + myprog1.distance(p1, p2));


       System.out.println("Расстояние от точки p1 до p2 " + p1.distance(p2));


    }

    public static  double distance(Point p1, Point p2) {
        return  Math.sqrt((p1.y-p2.y)*(p1.y-p2.y)+(p2.x-p1.x)*(p2.x-p1.x)) ;
    }


}


//System.out.println("Площадь квадрата со стороной" + s.l + " = " + s.area());

/*public class myprog1 {

	//public static void main(String[] args) {
		String somebody = "world";
			hello();
			hello("world");
			hello("user");
			hello("Alexei");



		Square s = new Square(5);
		s.l = 5;
		double l = 5;
		System.out.println("Площадь квадрата со стороной" + s.l + " = " + s.area());


		Rectangle r = new Rectangle(4, 6);
		r.a = 4;
		r.b = 6;
		System.out.println("ПЛощадь прямоугольника со стороной " + r.a + "и" + r.b + "=" + r.area());

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



	public static double area(Rectangle r){
		return r.a * r.b;

	}
}

	//public static void area(double a, double b) {
*/

