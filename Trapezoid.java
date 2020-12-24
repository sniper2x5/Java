
public class Trapezoid extends Quadrilateral {
	private double s1, s2, s3 ,s4;
	
	public Trapezoid() {
	}
	
	/**
	 * Outputs area and perimeter of a Trapezoid shape given 4 side lengths
	 * @param s1 parralel to s2
	 * @param s2 parralel to s1
	 * @param s3 3rd side length
	 * @param s4 4th side length
	 */
	public Trapezoid(double s1, double s2, double s3, double s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.area = ((s1 + s2)/2) * (Math.pow(((Math.pow(s3, 2) - ((Math.pow(s3, 2) + Math.pow((s2 - s1), 2) - Math.pow(s4, 2)) / (2 * (s2 - s1))))), 0.5));
		this.perimeter = (s1 + s2 + s3 + s4);
		
	}
	
	public void printInfo () {
		System.out.println ("The first side length of this Trapezoid is = " +
				this.s1);
		System.out.println ("The first side length of this Trapezoid is = " +
				this.s2);
		System.out.println ("The first side length of this Trapezoid is = " +
				this.s3);
		System.out.println ("The first side length of this Trapezoid is = " +
				this.s4);
		super.printInfo();
	}
	
}
