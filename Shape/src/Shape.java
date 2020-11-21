
public class Shape
{
	String color,s;
	boolean filled;
	Shape()
	{
		color="green";
		filled=true;
	}
	public Shape(String c,boolean fill)
	{
		color=c;
		filled=fill;
	}
	public String getColor()
	{
		return color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public String toString()
	{
		if(filled)
			s="filled";
		else
			s="not filled";
		return "A Shape with color of "+color+" and "+s;
	}
	public double getArea() 
	{
		return 0.0;
	}
	public double getPerimeter() 
	{
		return 0.0;
	}
}
