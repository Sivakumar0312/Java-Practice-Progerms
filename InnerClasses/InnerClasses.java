class Outer
{
		public void show()
		{
			System.out.println("It is Outer class");
		}
}
class Inner
{
	public void Iner()
	{
		Outer in = new Outer();
		in.show();
		System.out.println("It is inner class");
	}
	
}
public class InnerClasses{
	public static void main(String[] args) {
		
		Inner inn = new Inner();
	
		inn.Iner();
		}	
	}