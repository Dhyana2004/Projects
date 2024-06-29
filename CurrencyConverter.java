import java.util.Scanner;

public class CurrencyConverter {

    static double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("| Welcome to currency converter, please select the currency you want to convert |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("List of currencies available for exchange, please select a valid country currency number:");
        System.out.println("1. Kuwaiti Dinar (KWD)\n" +
                           "2. Bahraini Dinar (BHD)\n" +
                           "3. Omani Rial (OMR)\n" +
                           "4. Jordanian Dinar (JOD)\n" +
                           "5. British Pound Sterling (GBP)\n" +
                           "6. Gibraltar Pound (GIP)\n" +
                           "7. Cayman Islands Dollar (KYD)\n" +
                           "8. Swiss Franc (CHF)\n" +
                           "9. Euro (EUR)\n" +
                           "10. US Dollar (USD)\n" +
                           "11. Canadian Dollar (CAD)\n" +
                           "12. Australian Dollar (AUD)\n" +
                           "13. Singapore Dollar (SGD)\n" +
                           "14. Brunei Dollar (BND)\n" +
                           "15. Indian Rupee (INR)");
        System.out.println();
        System.out.print("select the currency you have for exchange: ");
        double currency1 = input.nextDouble();
        System.out.println();
        System.out.print("enter the amount to convert: ");
        double amount = input.nextDouble();
        System.out.println();
        System.out.print("select the currency you want to exchange to (enter the number): ");
        int currency2 = input.nextInt();

        double exchangeRate = 0;
        String currencyName = "";

        switch (currency2) {
            case 1:
                currencyName = "Kuwaiti Dinar (KWD)";
                exchangeRate = 0.0037;
                break;
            case 2:
                currencyName = "Bahraini Dinar (BHD)";
                exchangeRate = 0.0038;
                break;
            case 3:
                currencyName = "Omani Rial (OMR)";
                exchangeRate = 0.0039;
                break;
            case 4:
                currencyName = "Jordanian Dinar (JOD)";
                exchangeRate = 0.004;
                break;
            case 5:
                currencyName = "British Pound Sterling (GBP)";
                exchangeRate = 0.005;
                break;
            case 6:
                currencyName = "Gibraltar Pound (GIP)";
                exchangeRate = 0.005;
                break;
            case 7:
                currencyName = "Cayman Islands Dollar (KYD)";
                exchangeRate = 0.0083;
                break;
            case 8:
                currencyName = "Swiss Franc (CHF)";
                exchangeRate = 0.009;
                break;
            case 9:
                currencyName = "Euro (EUR)";
                exchangeRate = 0.0088;
                break;
            case 10:
                currencyName = "US Dollar (USD)";
                exchangeRate = 0.010;
                break;
            case 11:
                currencyName = "Canadian Dollar (CAD)";
                exchangeRate = 0.013;
                break;
            case 12:
                currencyName = "Australian Dollar (AUD)";
                exchangeRate = 0.014;
                break;
            case 13:
                currencyName = "Singapore Dollar (SGD)";
                exchangeRate = 0.0135;
                break;
            case 14:
                currencyName = "Brunei Dollar (BND)";
                exchangeRate = 0.0135;
                break;
            case 15:
                currencyName = "Indian Rupee (INR)";
                exchangeRate = 0.012;
                break;
            default:
                System.out.println("invalid selection please run the program again and select a valid currency number.");
                System.exit(0);
        }

        double finalCurrency = convert(amount, exchangeRate);
        System.out.println("you have selected " + currencyName);
        System.out.println("converted amount: " + finalCurrency);
    }
}
