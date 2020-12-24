
public class Square extends Rectangle{
	private double s;
	
	public Square() {
	}
	/**
	 * Outputs the area and perimeter of a Square given it's side length
	 * @param s is the side length of the square
	 */
	public Square(double s) {
		this.s = s;
		this.area = s*s;
		this.perimeter = s*4;
	}
	
	public void printInfo () {
		System.out.println ("The side length of this square is = " +
				this.s);
		super.printInfo();
	}
}
