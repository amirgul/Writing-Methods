public class DollarFormat
{
    public static void write(double amount)
    {
        int  allcents = (int)(Math.round(amount *100));
        int dolloars = allcents/100;
        int cents = allcents%100;
        System.out.print(dolloars);
        System.out.print('.');
        if(cents <10)
        {
            System.out.print(0);
            System.out.print(cents);
        }
        else
            System.out.print(cents);

    }
    public static void writePositive(double amount)
    {
        if(amount >= 0)
        {
            System.out.print('$');
            write(amount);
        }
        else
        {
            double positive = Math.abs(amount);
            System.out.print('$');
            System.out.print('-');
            write(positive);
        }
    }
}
