
public class Rectangle extends Shape
{
	double width,length;
	public Rectangle() 
	{
		width=1.0;
		length=1.0;
	}
	public Rectangle(double w,double l) 
	{
		width=w;
		length=l;
	}
	public Rectangle(String c,boolean fill,double w,double l)
	{
		color=c;
		filled=fill;
		width=w;
		length=l;
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return "A Rectangle with width= "+width+" and length = "+length+", which is a subclass of "+super.toString();
	}
}
