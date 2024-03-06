import java.text.NumberFormat;
public class CurrencyFormatter {
    public static void main(String[] args) {
        double number = 11243.0;
        String formattedCurrency = formatCurrency(number);
        System.out.println("Formatted Currency: " + formattedCurrency);
    }
    public static String formatCurrency(double number){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String formattedCurrency = currencyFormatter.format(number);
        return formattedCurrency;
    }
}
