package questions;



public class Rectangle extends Shape {

	double length;
	double weidth;

	public Rectangle(double length, double weidth) {

		this.length = length;
		this.weidth = weidth;
	}

	@Override
	public double area() {

		return length * weidth;

	}

	@Override
	public double peremeter() {

		return 2 * (length + weidth);

	}

}
