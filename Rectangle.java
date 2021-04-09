/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Jacob Choi 
*/
// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle

		// Constructor that creates a rectangle with
		// side lengths 1 whose bottom left corner is at (0.0,0.0)
		public Rectangle(){
			L = 1;
			H = 1;
			x = 0;
			y = 0;
		}

		// Constructor that takes all four inputs,
		// named Ell, Eich, Ex, and Why for L, H, x, and y, respectively.
		public Rectangle(double Ell, double Eich, double Ex, double Why){
			L = Ell;
			H = Eich;
			x = Ex;
			y = Why;
		}

		// Returns the length.
		public double getLength(){
			return L;
		}

		// Returns the height.
		public double getHeight(){
			return H;
		}

		// Takes as input a double called Ell and uses it to set the length of the rectangle.
		public void setLength(double Ell){
			L = Ell;
		}

		// Takes as input a double called Eich and uses it to set the height of the rectangle.
		public void setHeight(double Eich){
			H = Eich;
		}

		// Computes and returns the perimeter of the rectangle.
		public double perimeter(){
			return (2*L) + (2*H);
		}

		// Computes and returns the area of the rectangle.
		public double area(){
			return L*H;
		}

		// Returns true if the two rectangles have equal areas, false otherwise
		@Override
		public boolean equals(Object x){
			if(x instanceof Rectangle){
				Rectangle temp = (Rectangle) x; //casting x into a rectangle object
				return this.area() == temp.area();
			}
			else{
				return false;
			}
		}
}
