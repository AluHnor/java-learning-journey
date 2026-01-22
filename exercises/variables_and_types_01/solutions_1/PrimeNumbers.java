package exercises.variables_and_types_01.solutions_1;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 30;
            for (int iX = 2; iX <= limit; iX++) {
                boolean primeN = true;
            
                for (int divPN = 2; divPN < iX ; divPN++) {
                    if (iX % divPN == 0) {
                        primeN = false;
                    }
            }
                if (primeN) {
                    System.out.println(iX + " is a prime number.");
            }
        }
    
    }
}
