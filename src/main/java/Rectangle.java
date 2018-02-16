public class Rectangle {

	/*
	 * Design a class named Rectangle to represent a rectangle. It should contains
	 *  - Two double data fields named width and height. The default values for both is 1.
	 *  - A no-arg constructor that creates a default rectangle
	 *  - A constructor that creates a rectangle with the specified width and height
	 *  - Getter methods for the width and height
	 *  - A method named getArea() that returns the are of this rectangle A = l*w
	 *  - A method named getPerimeter() that returns the perimeter of this rectangle P = 2 * (l+w)
	 */
	private double width, height;

	// A no-arg constructor that creates a default rectangle
	public Rectangle() {
		width = 1;
		height = 1;
	}

	// A constructor that creates a rectangle with the specified width and height
	public Rectangle(double h, double wid) {
		width = wid;
		height = h;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// A method named getArea() that returns the are of this rectangle A = l*w
	public double getArea() {
		return width * height;
	}

	// A method named getPerimeter() that returns the perimeter of this rectangle P = 2 * (l+w)
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
