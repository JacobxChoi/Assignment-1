/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Jacob Choi 
*/
public class Cylinder extends Circle{
    
    protected double z; //height of cylinder

    //default constructor
    public Cylinder(){
        radius = 0;
        x = 0;
        y = 0;
        z = 0;
    }

    //set your own radius, x, y, z
    public Cylinder(double radius, double x, double y, double z){
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //returns height of cylinder
    public double getHeight(){
        return z;
    }
    //sets height of cylinder
    public void setHeight(double z){
        this.z = z;
    }
    //returns surface area of the cylinder
    @Override
    public double getArea(){ 
        return (super.getCircumference() * z) + (2 * super.getArea());
    }
    //returns volume of the cylinder
    public double getVolume(){
        return super.getArea()*z;
    }
}