public class ShapeTester {
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Jacob Choi 
*/

  // Takes as input two shapes
  // (a Circle first, then a Rectangle) and returns true if the area of
  // the circle is bigger than (or equal to) the area of the rectangle,
  // false otherwise.
  public static boolean isLarger(Circle x, Rectangle y){
      if(x.getArea() > y.area()){
        return true;
      }
      else{
        return false;
      }
  }

  // Takes as input
  // a Circle object followed by a Rectangle object and returns
  // the length of the perimeter of the longer of the two objects.
  public static double longerPerim(Circle x, Rectangle y){
    if(x.getCircumference() > y.perimeter()){
      return x.getCircumference();
    }
    else{
      return y.perimeter();
    }
  }

  // Takes as input a Rectangle object
  // followed by a Circle object. The method also returns the length of
  // the perimeter of the longer of the two objects.
  public static double longerPerim(Rectangle y, Circle x){
    if(x.getCircumference() > y.perimeter()){
      return x.getCircumference();
    }
    else{
      return y.perimeter();
    }
  }

  // Takes as input
  // a Circle object followed by a Rectangle object and returns
  // the area of the larger of the two objects.
  public static double largerArea(Circle x, Rectangle y){
    if(x.getArea() > y.area()){
      return x.getArea();
    }
    else{
      return y.area();
    }
  }

  // Takes as input a Rectangle object followed by a Circle object.
  public static double largerArea(Rectangle y, Circle x){
    if(x.getArea() > y.area()){
      return x.getArea();
    }
    else{
      return y.area();
    }
  }

  // Takes as input two circles,
  // and returns true if the first circle contains the center of the second circle,
  // false otherwise.

  public static boolean containsCenter(Circle x, Circle y){

    if(Math.sqrt(Math.pow(y.getCenter()[0]-x.getCenter()[0], 2)+Math.pow(y.getCenter()[1]-x.getCenter()[1], 2))<=x.getRadius()){
      return true;
    }
    else{
      return false;
    }
  }

}
