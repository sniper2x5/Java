
public class Quadrilateral extends Shape {
	private double s1, s2, s3, s4, diagonal;
	
	public Quadrilateral () {		
	}
	/**
	 * Outputs Area and Perimeter of a Quadrilateral given it's sides and diagonal
	 * @param s1 first side length
	 * @param s2 second side length
	 * @param s3 third side length
	 * @param s4 fourth side length
	 * @param diagonal  the diagonal is from the side1 & side4 intersection to the side2 & side3 intersection
	 */
	public Quadrilateral (double s1, double s2, double s3, double s4, double diagonal) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.diagonal = diagonal;
		double heron1 = (s1 + s2 + diagonal)/2;
		double heron2 = (s3 + s4 + diagonal)/2;
		this.perimeter = (s1 + s2 + s3 + s4);
		this.area = Math.pow(heron1 * (heron1 - s1) * (heron1 - s2) * (heron1 - diagonal), 0.5) + Math.pow(heron2 * (heron2 - s3) * (heron2 - s4) * (heron2 - diagonal), 0.5);
	}

	
	public void printInfo () {
		super.printInfo();
		
		System.out.println ("The first side length of this Quarilateral is = " +
				this.s1);
		System.out.println ("The second side length of this Quarilateral is = " +
				this.s2);
		System.out.println ("The third side length of this Quadrilateral is = " +
				this.s3);
		System.out.println ("The fourth side length of this Quadrilateral is = " +
				this.s4);
		System.out.println ("The diagonal of this Quadrilateral is = " +
				this.diagonal);
		
	}
}