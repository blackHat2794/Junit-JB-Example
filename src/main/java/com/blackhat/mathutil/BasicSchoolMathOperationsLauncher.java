import com.blackhat.mathutil.BasicSchoolMathOperations;

public class BasicSchoolMathOperationsLauncher
{
	public static void main(String... args){
	
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();

		System.out.println("The addition of 2 number is: "+ mathOperations.add(100,200));

		System.out.println("The Substraction of 2 number is: "+ mathOperations.subtract(400,200));
	}
}
