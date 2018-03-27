//Completed file given as a starter file

public class Point {
public int y;
public int x;
boolean flag = false;
boolean flag1 = false;

 public Point() {
   x = 999;
   y = 999;
 } // end no-arg constructor

 public Point(int newX, int newY) {
   x = newX;
   y = newY;
 } // end 2-arg constructor

 public int getX() {
   return x;
 } // end getX()

 public int getY() {
    return y;
 } // end getY()


 public void setX(int newX) {
  x = newX;
 } // end setX()

 public void setY(int newY) {
   y = newY;
 } // end setX()

} // end class
