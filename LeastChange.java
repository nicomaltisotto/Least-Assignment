import java.util.Random;

public class LeastChange {

    public static void main(String[] args) {

        Random rand = new Random();

        for (int run = 1; run <= 5; run++) {

            int change = rand.nextInt(100); // 0–99 cents
            System.out.println("\nTotal change = " + change);

            int remaining = change;

            int halfDollars = remaining / 50;
            remaining %= 50;

            int quarters = remaining / 25;
            remaining %= 25;

            int dimes = remaining / 10;
            remaining %= 10;

            int nickels = remaining / 5;
            remaining %= 5;

            int pennies = remaining;

            printCoin("Half Dollar", "Half Dollars", halfDollars);
            printCoin("Quarter", "Quarters", quarters);
            printCoin("Dime", "Dimes", dimes);
            printCoin("Nickel", "Nickels", nickels);
            printCoin("Penny", "Pennies", pennies);
        }
    }

    public static void printCoin(String singular, String plural, int count) {
        if (count == 0) return;

        if (count == 1) {
            System.out.println(singular + ".......... " + count);
        } else {
            System.out.println(plural + ".......... " + count);
        }
    }
}





