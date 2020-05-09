/** This class allows the calculation of Body Mass Index.
 * The process is:
 * 	data: height & weight
 *	IF height or weight = 0: error: "Incorrect input values." THEN return to beginning (ask input) END IF
 *	x = weight / height^2
 *	message user: "The result BMI is: ", x
 * ---
 * @author Zsombor
 */
public class BMICalculator {
	private double weight, height, bmi; // variable declaration

	public BMICalculator () {} // constructor
	
	public BMICalculator (double weight, double height) { // constructor
		this.weight = weight;
		this.height = height;
	}

	public static void main(String[] args) {
		BMICalculator calculator = new BMICalculator(60, 0.70); //new app instance with static input
		//BMICalculator calculator = new BMICalculator(); //generic new app instance
		//calculator.inputData();		
		double bmic = calculator.calculate();
		System.out.println("The result BMI is: " + bmic);
		System.out.println("Overweight? " + calculator.isOverweight());
	}
	
	public double calculate() { // take input & calculate BMI
		return bmi = weight / (height * height);
		//return weight / (height * height);
	}

	public boolean isOverweight() { // check for "bad weight status" based on the MBI.
		return (bmi > 25);
	}
	
	public void inputData() {
		String i;
		System.out.println("Enter weigth: ");
		i = System.console().readLine();
		this.weight = Double.parseDouble(i);
	    System.out.println("--> " + this.weight);
	    System.out.println("Enter heigth: ");
	    i = System.console().readLine();
	    this.height = Double.parseDouble(i);
	    System.out.println("--> " + this.height);
	}
}