package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("$10,000 at 2% interest =$" + calculateInterest(10000.0, 2.0));
        System.out.println("$10,000 at 3% interest =$" + calculateInterest(10000.0, 3.0));
        System.out.println("$10,000 at 4% interest =$" + calculateInterest(10000.0, 4.0));
        System.out.println("$10,000 at 5% interest =$" + calculateInterest(10000.0, 5.0));
        System.out.println("$10,000 at 6% interest =$" + calculateInterest(10000.0, 6.0));
        System.out.println("$10,000 at 7% interest =$" + calculateInterest(10000.0, 7.0));
        System.out.println("$10,000 at 8% interest =$" + calculateInterest(10000.0, 8.0));

        System.out.println();

//        for (init; termination/condition; increment/decrement(iterator)){
        for (int i = 0; i < 11; i++) {
            System.out.println("Loop " + i + " Hi Teejay, you are a great programmer!");
        }

        System.out.println();

//          TODO:- Challenge 1
//        Using the for statement, call the calculateInterest method with
//        the amount of 10,000 with an interestRate of 2, 3, 4, 5, 6, 7
//        and 8. Print the results to the console window

//        Modify the for loop statement above to do the same thing as shown
//        but to start from 8% and work back to 2%


//          TODO:- Solution To Challenge 1
        for (int i = 2; i < 9; i++) {
            System.out.println("The interest rate of $10,000 at " + i + " = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println();

        for (int i = 8; i > 1; i--) {
            System.out.println("The interest rate of $10,000 at " + i + " = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("**********************************************");

//          TODO:- Solution To Challenge 2
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting for loop..., bye!");
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

//          TODO:- Challenge 3
//        Create a for statement using a range of numbers from 1 to 1000 inclusive;
//        Sum all the numbers that can be divided with both 3 and also with 5;
//        For those numbers that met the above conditions, print out the numbers;
//        break out of the loop once you find 5 numbers that met the above conditions;
//        After breaking out of the loop, print the sum of the numbers that met the above conditions;
//        NOTE: Type all code in main method

//          TODO:- Solution To Challenge 3
        int count1 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                count1++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count1 == 5){
                break;
            }
        }

        System.out.println("The sum of numbers found = " + sum);
    }

//          TODO:- Challenge 2
//      Create a for statement using any range of numbers
//      Determine if the number is a prime number using the isPrime method
//      If it is a prime number, print it out AND increment a count of the
//      number of prime numbers found
//      If that count is 3, exit the for loop
//      Hint: Use the break statement to exit

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
//    for (int i = 2; i <= (long) Math.sqrt(n); i++){}
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }
}
