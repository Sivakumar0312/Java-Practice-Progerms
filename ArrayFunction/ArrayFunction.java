package Lesson12;

public class ArrayFunction {

	public static void main(String[] args) {
		int[] rollNo = {1,2,3,4,5,6,7,8,9,10};
		String[] StudenteName = {"Siva","Rahul","Raji","Shashank","Ravi","Yashoo"};
		float[] Percentage = {0.1f,0.2f,0.3f,0.3f,0.4f,0.5f};
		System.out.println(rollNo[5]);
		System.out.println(StudenteName[5]);
		System.out.println(Percentage[5]);
		for(int j=0;j<StudenteName.length; j++)
		{
			System.out.println(StudenteName[j]);
		}
	}

}
