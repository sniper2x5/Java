
public abstract class Shape {
	protected double area;
	protected double perimeter;
	
	// Displays the area and perimeter of the shape to the console
	protected void printInfo() {
		System.out.println ("area =" + this.area + " perimeter = " + this.perimeter);			
	}
}
