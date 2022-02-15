
public class BMI 
{
	private double weight;
	private double height;
	
	public BMI(){}

	
	public BMI(double weight, double height)
	{
		this.weight = weight;
		this.height = height;
	}
		
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI() 
	{
		double result = (this.weight * 0.45359237) / Math.pow((this.height * 0.0254), 2); 
		return result;
	}
	
	public String getBMIReport(double BMI) {
		String result = "";
		
		if(BMI < 18.5) 
		{
			result = "Underweight";
		}
		
		else if(BMI >= 18.5 && BMI < 25) 
		{
			result = "Normal";
		}
		
		else if(BMI >= 25 && BMI <30) 
		{
			result = "Overweight";
			
		}
		
		else 
		{
			result = "Obese";
		}
		
		return result; 
    }

	}
	
	

