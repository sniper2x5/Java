
public class Ellipse {
	private double width, height; 
	
	public Ellipse() {
	}
	
	public Ellipse(double width, double height) {
		this.width = width;
		this.height = height;
		this.area = Math.PI * width * height;
		this.perimeter = Math.PI * (3 * (width + height) - Math.pow(((3 * width) + height) * ((3 * height) + width), 0.5));
	}
}
