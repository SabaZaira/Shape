
public class Square extends Rectangle
{
	public double getSide()
	{
		return super.getLength();
		
	}
	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}
	public double getArea()
	{
		return getSide()*getSide();
	}
	public double getPerimeter()
	{
		return 4*getSide();
	}
	public String toString()
	{
		return "A Square with side = " +getSide()+ ", which is a subclass of "+super.toString();
	}
}
