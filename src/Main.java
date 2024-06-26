//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLOutput;

//Task One
public class Main {
    public static void main(String[] args) {
// Declare two Integer variable.
    int a, b;
// Assign integer to each.
     a = 10;
     b = 20;
// Assign the sum to a variable.
    int intSum = a + b;
// Print out the results.
    System.out.println("The sum of these two variables is :" + intSum);


// Task Two
    // Declares two double variable
    double c, d;
    c = 3.14567;
    d = 1000;

// Assign the sum to a variable.
        double doubleSum = c + d;
// Print the results
    System.out.println("The sum of these double variables is: " + doubleSum);


// Task Three
// Add an Integer and Double variables
    double intDoubleSum = a + c;

// Print results.
    System.out.println("The sum of an Int and double value is : " + intDoubleSum + ", which is a double variable type.");

// Divides the larger number by the smaller number.
       // int e, f;
         int e = 30;
         int f = 5;
        int divSum = e/f;
// Change the larger number to a decimal, in this case change b.
       // float e = 5.689f;

// Print both results.
    System.out.println("The sum of these divided value is: " + divSum);
    System.out.println("The sum of these divided value is: " + e);

// Two double variables.
  double g, h;
     g = 27.7497;
     h = 2.89;

     double divDouble = g/h;
     int result = (int)divDouble;

     System.out.println("The quotient is: " + divDouble);
     System.out.println("The quotient when applying int is: " + result);


// Declares two integer values x and y.
    int x, y;
//Assign x to 5.
     x = 5;
//Assign y to 6.
     y = 6;
//Declare q to y/x and print it.
    int q = y/x;
    System.out.println("The result is, " + q);

// Cast y to a double and assign it to q. Then print q again.

    System.out.println("The result when doubled is " + );


// Declare a named constant and uses it in a calculation.
    final int num = 35;
    int total = num + 1;

    System.out.println("The result of this calculated constant is " + total);

// Create three variables to represent a cafe.
        double coffee, cappuccion, espresso, subtotal, totalSale;
        coffee = 14.60;
        cappuccion = 15.30;
        espresso = 10.35;

        subtotal = ((3 * coffee) + (4 * cappuccion) + (2 * espresso));

        final double SALES_TAX = 2.57;
        totalSale = subtotal + SALES_TAX;

        System.out.println("The subtotal is " + subtotal);
        System.out.println("The total sale price is " + totalSale);

    }

}

