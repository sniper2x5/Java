
public class RightAngledTriangle extends Triangle {
	private double height, width;
	
	public RightAngledTriangle() {
	}
	
	/**
	 * Outputs the area and perimeter of a Right Angled Triangle given it's height and width
	 * @param height is the height of the right angled triangle
	 * @param width is the width of the right angled triangle
	 */
	public RightAngledTriangle (double height, double width) {
		this.height = height;
		this.width = width;
		this.area = (width * height)/2;
		this.perimeter = width + height + Math.pow((width * width) + (height * height),0.5);
		}
	
	public void printInfo () {
		System.out.println ("The height of this Right Angled Triangle is = " +
				this.height);
		System.out.println ("The height of this Right Angled Triangle is = " +
				this.width);
		super.printInfo();
	}
	
}
