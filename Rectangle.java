
public class Rectangle extends Quadrilateral{
	private double width, height;
	
	public Rectangle () {
	}
	
	/**
	 * Outputs the Area and perimeter of a Rectangle given it's width and height
	 * @param width is the width of the rectangle
	 * @param height is the height of the rectangle
	 */
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
		this.perimeter = 2 * (width + height);
	}

	@Override
	public void printInfo () {
		System.out.println ("The width of this rectangle is = " +
				this.width);
		System.out.println ("The height of this rectangle is = " +
				this.height);
		super.printInfo();
	}
}

