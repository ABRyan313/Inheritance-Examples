package questions;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		System.out.println("Area of circle is: "+c.area());
		System.out.println("Perimeter of circle is: "+c.peremeter());
		
		
		Rectangle r = new Rectangle(5,5);
		System.out.println("Area of Rectangle is: "+r.area());
		System.out.println("Perimeter of Rectangle is: "+r.peremeter());
		
		Triangle t = new Triangle(5,5,5);
		System.out.println("Area of Triangle is: "+t.area());
		System.out.println("Perimeter of Triangle is: "+t.peremeter());
		
		

	}

}
