
public class Circle extends Shape
{
	double radius;
	public Circle() 
	{
		radius=1.0;
	}
	public Circle(double r) 
	{
		radius=r;
	}
	public Circle(String c,boolean fill,double r)
	{
		color=c;
		filled=fill;
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String toString()
	{
		return "A Circle with radius= "+radius+", which is a subclass of "+super.toString();
	}
}
