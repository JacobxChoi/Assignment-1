/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Jacob Choi 
*/
// This class represents a circle shape
public class Circle {

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
      // Initializing the values of the instance variables
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }

    public Circle(double r, double ex, double why) {
      radius = r;
      x = ex;
      y = why;
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
     double[] c = {this.x, this.y};
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
      return radius * radius * Math.PI;
    }

    public double getCircumference() {
    	return 2 * Math.PI * radius;
    }

    // Returns true if circleA
    // has a larger area than circleB, false otherwise.
    public boolean isBiggerThan(Circle circleToCompare) {
      if(this.radius > circleToCompare.radius){
        return true;
      }
      else{
        return false;
      }
    }

    // Returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    public boolean containsPoint(double x, double y) {
    	if(Math.sqrt(Math.pow(x-this.x, 2)+Math.pow(y-this.y, 2)) <= this.radius){
        return true;
      }
      else{
        return false;
      }
    }

    // Sets this object's radius
    // based on the passed parameter (of type double).
    public void setRadius(double r){
      this.radius = r;
    }

 
    // Sets the x coordinate of the circle to ex,
    // and the y coordinate of the circle to why.
   public void setCenter(double ex, double why){
      this.x = ex;
      this.y = why;
   }


    // "This circle is centered at point <display_coordinate_of_center_here>
    // with radius <display_radius>"
    @Override
    public String toString() {
        return "This circle is centered at point (" + this.getCenter()[0] + "," + this.getCenter()[1] + ") with radius " + this.getRadius(); // TODO
    }

	  // return true if the
		// two circles have equal areas, false otherwise
    
    @Override
    public boolean equals(Object x) {
      if (x instanceof Circle) { 
        Circle temp = (Circle) x; //cast x into an object of type circle
        return this.getArea() == temp.getArea();
      }
      else{
        return false;
      }
    }
}
