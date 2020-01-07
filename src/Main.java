import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Enter the amount");
        Scanner keyboard = new Scanner(System.in);
        double amount = keyboard.nextDouble();
        DollarFormat.writePositive(amount);


    }
}
