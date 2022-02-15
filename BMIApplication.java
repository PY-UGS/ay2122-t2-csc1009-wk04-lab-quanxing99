import java.util.Scanner;

public class BMIApplication
{
	
	public static void main(String[] args) 
	{
		BMI bmi001 = new BMI();
				
		// Take Annual Interest Rate from user
		Scanner weightInput = new Scanner(System.in);
		System.out.println("Enter weight in pound:");
		double userWeight = weightInput.nextDouble(); 
			
		// Take Annual Interest Rate from user
		Scanner heightInput = new Scanner(System.in);
		System.out.println("Enter height in inches:");
		double userHeight = heightInput.nextDouble(); 
		
		
		bmi001.setWeight(userWeight);
		bmi001.setHeight(userHeight);
		
		
		weightInput.close();
		heightInput.close();

		System.out.println("BMI is " + bmi001.getBMI());
		System.out.println(bmi001.getBMIReport(bmi001.getBMI()));

		
	}
	
}
