// 1.
// class loops
// {
	// public static void main(String [] args)
	// {
		// for(int i=0;i<10;i++)
		// {
			// System.out.println("Bright IT Career");
		// }
		
	// }
// }

// 2.

// class loops
// {
	// public static void main(String[]args)
	// {
		// int k=1;
		// while(k<=20)
		// {
			// System.out.println(k);
			// k++;
		// }
	// }
// }
// 3.
// import java.util.*;
// class loops
// {
	// public static void main(String[]args)
	// {
		// Scanner p = new Scanner(System.in);
		// System.out.print("Enter the 1st number :");
		// int a = p.nextInt();
		// System.out.print("Enter the 2nd number :");
		// int b = p.nextInt();
		// if(a>b){
			// System.out.println("A is Gratter");
		// }
		// else
		// {
		// System.out.println("B is Gratter");
		// }
	// }
// }

// 4.
// import java.util.*;
// class loops
// {
	// public static void main(String [] args)
	// {
		// Scanner p = new Scanner(System.in);
		// System.out.print("Enter the  number :");
		// int a = p.nextInt();
		// if(a%2==0){
			// System.out.println("Even Number");
		// }
		// else{
			// System.out.println("Odd Number");
		// }
	// }
// }

// 5.
// import java.util.*;
 // class loops
// {
	// public static void main(String [] args)
	// {
		// Scanner p = new Scanner(System.in);
		// System.out.print("Enter the 1st number :");
		// int num1 = p.nextInt();

		// System.out.print("Enter the 2nd number :");
		// int num2 = p.nextInt();

		// System.out.print("Enter the 3rd number :");
		// int num3 = p.nextInt();	

 // int largest;
        // if (num1 >= num2 && num1 >= num3) {
            // largest = num1;
        // } else if (num2 >= num1 && num2 >= num3) {
            // largest = num2;
        // } else {
            // largest = num3;
        // }
        // System.out.println("The largest number is: " + largest);
		
	// }
// }

// 6.
// class loops
// {
	// public static void main(String [] args)
	// {
		// int a=10;
		// while(a<=100){
			// System.out.println(a);
			// a +=2;
			
		// }
	// }
// }

// 7.
// class loops
// {
    // public static void main(String[] args) {
        // int i = 1;
        // do {
            // System.out.println(i);
            // i++; 
        // } while (i <= 10);
    // }
// }

// 8.

 // class loops {

    // public static void main(String[] args) {

        // int number = 371, originalNumber, remainder, result = 0;

        // originalNumber = number;

        // while (originalNumber != 0)
        // {
            // remainder = originalNumber % 10;
            // result += Math.pow(remainder, 3);
            // originalNumber /= 10;
        // }

        // if(result == number)
            // System.out.println(number + " is an Armstrong number.");
        // else
            // System.out.println(number + " is not an Armstrong number.");
    // }
// }

// 9.
// import java.util.*;

// class loops
 // {
    // public static void main(String[] args) {
        // Scanner p = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int a = p.nextInt();
        
        // if (a == 1) {
            // System.out.println("Neither Prime nor Composite");
        // } else {
            // boolean isPrime = true;
            // for (int i = 2; i <= Math.sqrt(a); i++) {
                // if (a % i == 0) {
                    // isPrime = false;
                    // break;
                // }
            // }
            // if (isPrime) {
                // System.out.println("Prime");
            // } else {
                // System.out.println("Not Prime");
            // }
        // }
    // }
// }
// 10.
// import java.util.Scanner;

// class loops
 // {
    // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        // int original = num;
        // int reversed = 0;

        // while (num > 0) {
            // int digit = num % 10;
            // reversed = (reversed * 10) + digit;
            // num = num / 10;
        // }

        // if (original == reversed) {
            // System.out.println(original + " is a Palindrome.");
        // } else {
            // System.out.println(original + " is not a Palindrome.");
        // }
    // }
// }
// 11.
// import java.util.Scanner;

// class loops {
    // public static void main(String[] args) {
        // Scanner p = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = p.nextInt();
        // int remainder = num % 2;

        // switch (remainder) {
            // case 0:
                // System.out.println(num + " is Even.");
                // break;
            // case 1:
            // case -1:
                // System.out.println(num + " is Odd.");
                // break;
            // default:
                // System.out.println("Invalid input.");
        // }

        // p.close();
    // }
// }
// 12.

// import java.util.Scanner;

// class loops {
    // public static void main(String[] args) {
        // Scanner p = new Scanner(System.in);
        // System.out.print("Enter gender (m/f): ");
        // char gender = p.next().charAt(0);

        // switch (gender) {
            // case 'm':
            // case 'M':
                // System.out.println("Male");
                // break;
            // case 'f':
            // case 'F':
                // System.out.println("Female");
                // break;
            // default:
                // System.out.println("Invalid input");
        // }

        // p.close();
    // }
// }

//13.
class loops {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest number.");
        } else {
            System.out.println("There is a tie.");
        }
    }
}
