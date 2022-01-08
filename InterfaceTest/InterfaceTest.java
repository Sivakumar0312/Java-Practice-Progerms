package Lesson12;

interface Area
{
final static float pi=3.14f;
float compute(float x, float y);
}
class reactangle implements Area
{
public float compute(float x, float y)	{
	return x*y;
}
}
class Circle implements Area{
	public float compute(float x, float y)	{
		return (pi*x*y);
	}
}

public class InterfaceTest {
	
	public static void mian(String args[]) {
		reactangle rect = new reactangle();
		Circle cir 		= new Circle();
		Area area;
		area = rect;
		System.out.println("Area of Reactangale =" + area.compute(10, 20));
		area = cir;
		System.out.println("Area of Reactangale =" + area.compute(10, 0));
		
	}

}
