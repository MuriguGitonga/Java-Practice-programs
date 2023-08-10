import java.util.Scanner;

public class WaterBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of units of water used: ");
        int unitsUsed = scanner.nextInt();
        
        if (unitsUsed < 0) {
            System.out.println("Invalid input: Units used cannot be negative.");
        } else if (unitsUsed > 20) {
            System.out.println("Invalid input: Units used cannot exceed 20.");
        } else {
            double bill = calculateBill(unitsUsed);
            System.out.println("Water Bill: " + bill + " Kenyan Shillings");
        }
        
        scanner.close();
    }
    
    public static double calculateBill(int unitsUsed) {
        double bill = 0.0;
        
        if (unitsUsed == 1) {
            bill = 100;
        } else if (unitsUsed % 2 == 0) {
            bill = (unitsUsed / 2) * 150;
        } else {
            int unitsFor100 = unitsUsed - 1;
            int unitsFor150 = 1;
            bill = (unitsFor100 / 2) * 150 + unitsFor150 * 100;
        }
        
        return bill;
    }
}
