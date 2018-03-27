import java.util.*;

public class Lab7 {
 public static void main(String[] args) {
	Point[] points = new Point[4];
  Scanner s = new Scanner(System.in);

	points[0] = new Point(1,1);

	//fill the rest of the array with the points (3,2), (0,4), and (1,6)
  points [1] = new Point(3,2);
  points [2] = new Point(0,4);
  points [3] = new Point(1,6);
	//create a Line object with the first two points in the array.  Call it line1
	Line line1 = new Line(points [0], points [1]);
	//create a Line object with the second two points in the array.  Call it line2.
  Line line2 = new Line(points [2], points [3]);
	//display line1 by calling display
  line1.display();
	//display line2 by calling display
  line2.display();
	//call 'intersects' method to see if line1 intersects line2.
	//Store the result in a boolean variable.
  boolean isIntersects = line1.intersects(line2);
	//if the result is true, print "Lines intersect"
  if (isIntersects == true){
    System.out.println("Lines intersect");
  }
	//if the result is not true, print "Lines do NOT intersect"
	if (isIntersects==false){
    System.out.println("Lines do NOT intersect");
  }
  //-----------------Part 2--------------------------------------
  System.out.print("Enter in a new x1-value: ");
  int newx1 = s.nextInt();
  System.out.print("Enter in a new y1-value: ");
  int newy1 = s.nextInt();
  System.out.print("Enter in a new x2-value: ");
  int newx2 = s.nextInt();
  System.out.print("Enter in a new y2-value: ");
  int newy2 = s.nextInt();

  points[0] = new Point(newx1,newy1);
  points [1] = new Point(newx2,newy2);
  line1 = new Line(points [0], points [1]);
	//create a Line object with the second two points in the array.  Call it line2.
  line2 = new Line(points [2], points [3]);
	//display line1 by calling display
  line1.display();
	//display line2 by calling display
  line2.display();
	//call 'intersects' method to see if line1 intersects line2.
	//Store the result in a boolean variable.
  isIntersects = line1.intersects(line2);
	//if the result is true, print "Lines intersect"
  if (isIntersects == true){
    System.out.println("Lines intersect");
  }
	//if the result is not true, print "Lines do NOT intersect"
	if (isIntersects==false){
    System.out.println("Lines do NOT intersect");
  }

	} // end main
} // end class
