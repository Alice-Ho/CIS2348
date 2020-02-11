import java.util.Scanner;

public class Homework_Assignment_1 {
    public static void main(String[] arg) {

        Scanner options = new Scanner(System.in);

            System.out.println("Please select a menu item from the list below:\n" +
                    "1 - View item menu \n" +
                    "2 - Pay total due \n" +
                    "3 - Add $5 in credit \n" +
                    "4 - Clear order");
            int optionSelect = options.nextInt();

            if (optionSelect == 1) {
                Scanner shopping = new Scanner(System.in);
                double currentTotal = 0.0;
                System.out.println("What would you like to add to your order? \n" +
                        "(1) Toaster: $19.99 \n" +
                        "(2) Coffee maker: $29.49 \n" +
                        "(3) Waffle maker: $15.79 \n" +
                        "(4) Blender: $24.99 \n" +
                        "(5) Kettle: $24.99 \n" +
                        "(6) Go to the main menu");
                System.out.println("Your current total is: $" + currentTotal);
                int shoppingOptions = shopping.nextInt();
            }





    }
}