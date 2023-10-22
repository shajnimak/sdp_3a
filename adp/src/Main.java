import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Binary number: ");
        Scanner sc = new Scanner(System.in);

        String binary = sc.nextLine();

        TwoBinary twoBinary = new TwoBinary(binary);

        DecimalAdapter adapter = new DecimalAdapter(twoBinary);
        System.out.println("Decimal number is " + adapter.convertDecimal());
    }
}
