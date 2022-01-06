package SecondWeek;

public class Circle
{
    //Variables
    private double radius;
    //Default Constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }
    // get area
    public double area()
    {
        return (this.radius * this.radius) * Math.PI;
    }
    //get circumference
    public double circumference()
    {
        return 2 * Math.PI * this.radius;
    }
    //get radius
    public double getRadius()
    {
        return this.radius;
    }
    //returns a string representation such as "Circle{radius=2.5}"
    public String toString()
    {
        return "Circle{radius=" + this.radius + "}";
    }
}
