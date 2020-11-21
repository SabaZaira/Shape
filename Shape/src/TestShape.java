
public class TestShape
{
	public static void main(String[] args)
	{
		Shape s1=new Shape();
		System.out.println(s1);
		Shape c1=new Circle();
		System.out.println(c1);
		Shape r1=new Rectangle(2.4,5.7);
		System.out.println(r1);
		System.out.println("Area : "+r1.getArea());
		System.out.println("Perimeter :"+r1.getPerimeter());
		Shape r2=new Square();
		System.out.println(r2);
		System.out.println("Area : "+r2.getArea());
		System.out.println("Perimeter :"+r2.getPerimeter());
	}
}
