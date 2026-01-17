package exercises.variables_and_types_01.solutions_1;

public class BMICalculator {
    public static void main(String[] args) {
        double weight = 59.8;
        double height = 1.99;
       
            if (weight <= 0 || height <= 0) {
                System.out.println("Please insert a valid data.");
            } else {
                double calcBMI = weight / (height * height);
               
                if (calcBMI >= 30) {
                    System.out.println ("Obese");
                } else if (calcBMI >= 25) {
                    System.out.println ("Overweight");
                } else if (calcBMI >= 18.5) {
                    System.out.println ("Normal");
                } else if (calcBMI < 18.5) {
                    System.out.println ("Underweight");
                }
               
                System.out.println ("Your Body Mass Index is " + String.format("%.2f", calcBMI));
            }
               
    }
}