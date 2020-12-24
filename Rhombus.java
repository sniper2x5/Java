
public class Rhombus extends Quadrilateral {
	private double diagonal1, diagonal2;
	
	public Rhombus() {
	}
	/**
	 * Outputs the Area and Perimeter of a Rhombus given both it's diagonals
	 * @param diagonal1 first diagonal
	 * @param diagonal2 second diagonal
	 */
	public Rhombus(double diagonal1, double diagonal2){
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.area = (diagonal1 * diagonal2) / 2;
		this.perimeter = 4 * Math.pow((diagonal1 * diagonal1 + diagonal2 * diagonal2), 0.5);
		
	}
	public void printInfo () {
		System.out.println ("The first diagonal of this Rhombus is = " +
				this.diagonal1);
		System.out.println ("The second diagonal of this Rhombus is = " +
				this.diagonal2);
		super.printInfo();
	}
	
}
