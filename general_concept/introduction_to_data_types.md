# BASE / OPERATORS / SYNTAX / EXAMPLES

A doc with my own notes about the basics of JAVA.

* @Variables and Data Types

    ! EXAMPLES !

        int age = 25; // Integer
        double price = 19.99; // Decimal
        char grade = 'A'; // Unique Character (ASCII)
        String name = "John"; // Text
        boolean isJavaFun = true; // True/False

* @Basic Operators

    ! EXAMPLES !

        int a = 10, b = 3;
        int sum = a + b;      // Sum (13)
        int diff = a - b;     // Subtraction (7)
        int product = a * b;  // Multiply (30)
        int quotient = a / b; // Division (3)
        int remainder = a % b; // MOD (1)
 
* @Conditionals (&If/&Else)

/*/Syntax
	if (condition) {
	// block of code to be executed if the condition is true
	}

    ! EXAMPLES !

        int score = 85;

        if (score >= 90) {
            System.out.println("A Grade");
        } else if (score >= 80) {
            System.out.println("B Grade"); // Gonna execute
        } else {
            System.out.println("C Grade");
        }

* @Short Hand If...Else (Ternary Operator)

/*/Syntax
	variable = (condition) ? expressionTrue : expressionFalse;

    ! EXAMPLES !

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

* @&Switch-&Case

/*/Syntax
    switch(expression) {
	 case x:
	 // code block
		 break;
	 case y:
	 // code block
		 break;
	 default:
	 // code block
	}

    ! EXAMPLES !

        int day = 3;
            String dayName;

            switch(day) {
		        case 1:
			        dayName = "Monday";
				        break;
		        case 2:
			        dayName = "Tuesday";
				        break;
		        case 3:
			        dayName = "Wednesday"; // Executed
				        break;
		        default:
			        dayName = "Invalid day";
	        }   
		        System.out.println(dayName); // Imprime "Wednesday"

* @Loop: $For

/*/Syntax
	for (statement 1; statement 2; statement 3) {
	// code block to be executed
	}

- Statement 1 is executed (one time) before the execution of the code block.

- Statement 2 defines the condition for executing the code block.

- Statement 3 is executed (every time) after the code block has been executed.

    ! EXAMPLES !

        //Print numbers from 1 to 5
        for(int i = 1; i <= 5; i++) {
	        System.out.println("Count: " + i);
        }

* @Loop: $While

/*/Syntax
	while (condition) {
	 // code block to be executed
	}

    ! EXAMPLES !

        // Print numbers from 1 to 3
            int count = 1;
	            while(count <= 3) {
		            System.out.println("While count: " + count);
	            count++;
        }

* @Loop: $Do-$While

/*/Syntax
	do {
	 // code block to be executed
	}
	while (condition);

    ! EXAMPLES !

        // Execute at least once
        int num = 5;
	        do {
		        System.out.println("Do-While: " + num);
	        num--;
        } while(num > 0);

* @Nested Loops

/*/Syntax
	// Outer Loop
		for (outer_initialization; outer_condition; outer_update) {
		// Inner Loop
			for (inner_initialization; inner_condition; inner_update) {
        	// Loop body
    	    }
        }

    ! EXAMPLES !

        ^Code
	        for (int i = 0; i < 3; i++) {          // External loop
		        for (int j = 0; j < 2; j++) {      // Internal loop
		        System.out.println("i=" + i + " j=" + j);
	            }
            }
        ^ Output
            i=0 j=0
            i=0 j=1
            i=1 j=0
            i=1 j=1
            i=2 j=0
            i=2 j=1

        ^Code
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
		            System.out.print("* ");
	            }
	                System.out.println();
            }
        ^ Output
            * 
            * * 
            * * * 
            * * * * 
            * * * * * 

        ^Code
            int rows = 5;

            for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
		            System.out.print("* ");
	            }
	                System.out.println();
            }

        ^ Output
            * * * * * 
            * * * * 
            * * * 
            * * 
            * 

        ^Code
            int n = 4;

            for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
		            System.out.print(j + " ");
	            }
	            System.out.println();
            }

        ^ Output
            1 
            1 2 
            1 2 3 
            1 2 3 4

        ^Code
            // Outer loop
            for (int i = 1; i <= 2; i++) {
	            System.out.println("Outer: " + i); // Executes 2 times

	            // Inner loop
	            for (int j = 1; j <= 3; j++) {
		            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
	            }
            } 

        ^ Output
            Outer: 1
                Inner: 1
                Inner: 2
                Inner: 3
            Outer: 2
                Inner: 1
                Inner: 2
                Inner: 3

* @For-Each

/*/Syntax
	for (type variableName : arrayName) {
		// code block to be executed
	}

    ! EXAMPLES !

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	        for (String i : cars) {
		        System.out.println(i);
	        }

* @$Array

/*/Syntax
	dataType[] arrayName = {value1, value2, value3, ...};

    ! EXAMPLES !

        // Integer Array
        int[] numbers = {10, 20, 30, 40};

        // Element Acess
        System.out.println(numbers[0]); // 10

        // Alternating Values
        numbers[1] = 25;

        // Iterating with @For
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }

* @Casting (type converter)

    ! EXAMPLES !

        // Implied Casting (automatic)
        int myInt = 9;
        double myDouble = myInt; // Converts to 9.0

        // Explicit Casting (manual)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Result: 9 (trunca decimais)

* @Methods (functions)

    - A block of code which only runs when it is called.
    - Can pass data through it, this data is known as parameters.
    - When passed to the Method, they’re called arguments.
    - Methods allow the reuse of codes.

    ! EXAMPLES !

        // No return method
        public static void greet(String name) {
	        System.out.println("Hello, " + name + "!");
        }

        // Return method
        public static int addNumbers(int x, int y) {
	        return x + y;
        }

        // Calling methods
        public static void main(String[] args) {
	        greet("Alice"); // Prints “Hello, Alice!”
	        int result = addNumbers(5, 3);
	        System.out.println("Sum: " + result); // Prints “Sum: 8”
        }

* @Scanner (data input)

    ! EXAMPLES !

        import java.util.Scanner;

        public class Main {
        	public static void main(String[] args) {
        		Scanner scanner = new Scanner(System.in);
        
        		System.out.print("Enter your name: ");
        		String userName = scanner.nextLine();
        
        		System.out.print("Enter your age: ");
        		int userAge = scanner.nextInt();
        
		        System.out.println("Hello " + userName + ", you are " + userAge + " years old.");
		        scanner.close();
	        }
        }

* @Complete Examples (bill system)

    ! EXAMPLES !

        import java.util.Scanner;

        public class GradeSystem {
	        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] grades = new double[3];

        
        // Receive notes
        for(int i = 0; i < 3; i++) {
	        System.out.print("Enter grade " + (i+1) + ": ");
	        grades[i] = scanner.nextDouble();
        }
        
        // Average Calculator
        double average = calculateAverage(grades);
        
        // Situation checker
	        String status = (average >= 6.0) ? "Approved" : "Failed";
        
	        System.out.println("Average: " + average);
	        System.out.println("Status: " + status);
	        scanner.close();
	        }
    
	        public static double calculateAverage(double[] grades) {
		        double sum = 0;
		        for(double grade : grades) {
			        sum += grade;
		            }
		            return sum / grades.length;
	            }
            }

* @$Final
Used for unchangeable variables, it becomes a constant, set to read-only.

    ! EXAMPLES !

        final int myNum = 13;
        myNum = 20;  // Error: cannot assign a value to final variable 'myNum'
