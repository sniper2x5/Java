
public class Circle extends Ellipse {
	private double r;
	
	private Circle() {
	}
	
	/**
	 * Outputs the Area and Perimeter of a circle given it's radius
	 * @param r is the radius of the circle
	 */
	private Circle(double r) {
		this.r = r;
		this.area = Math.PI * r * r;
		this.perimeter = 2 * Math.PI * r;		
	}
	
	public void printInfo () {
		System.out.println ("The Radius of this circle is = " +
				this.r);
		super.printInfo();
	}
}
