public class Question8 {
    public static void main(String[] args) {


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
