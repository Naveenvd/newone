import java.util.Scanner;
public class BMIcalculator {
    
    public static String bmiCategory(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
       
        double weightInKg ;
        double heightInMeters;
        String result = null;
        Scanner flo = new Scanner(System.in);
        System.out.print("Enter weight in Kg: ");
        weightInKg = flo.nextDouble();
        System.out.print("Enter height in meters: ");
        heightInMeters = flo.nextDouble();
        result = bmiCategory(weightInKg, heightInMeters);
        System.out.println("Your BMI category is: " + result);
    }
}
