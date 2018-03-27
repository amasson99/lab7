public class Line {
	private Point p1, p2;
	private double slope;
	private double y_intercept;

	public Line(Point first, Point second) {
		//initialize slope and y_intercept (use forumula from the lab writeup)
		//can access point values like this: first.getX()
		/*System.out.println("First Y = " + first.getY());
		System.out.println("Second Y = " + second.getY());
		System.out.println("First X = " + first.getX());
		System.out.println("Second X = " + second.getX());*/
		slope = (((double)second.getY())-(double)first.getY())/((double)second.getX()-(double)first.getX());
		y_intercept = first.getY() - (slope * first.getX());

	} // end 2-arg constructor

	public void display() {
		//Displays in the form "y = mx + b" representing this line
		//m is the slope and b is the y_intercept
		//displays m and b with 2-Decimals
		System.out.printf("y = %.2f", slope);
		System.out.printf("x + %.2f\n", y_intercept);
		} // end display()

	public boolean intersects(Line another) {
		//return true if THIS line (using the slope and y_intercept instance variables)
		//intersects another
		double slope1 = this.slope;
		double slope2 = another.slope;
		double y_int1 = this.y_intercept;
		double y_int2 = another.y_intercept;

		//two lines will intersect if their slopes are different
		//they will also intersect if the slopes AND y_intercepts are the same
		//otherwise, they will not intersect
		if ((slope1 != slope2)||((slope1 == slope2)&&(y_int1==y_int2))){
			return true;
		}else{
			return false;
		}



	} // end intersects()

} // end class
