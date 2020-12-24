
public class Triangle extends Shape{
	private double s1, s2, s3;
	
	public Triangle() {
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		double semiPer = (s1 + s2 +s3)/2;
		this.area = Math.pow(semiPer * (semiPer - s1) * (semiPer - s2) * (semiPer - s3), 0.5);
		this.perimeter = (s1 + s2 + s3);
	}
	
	
}
