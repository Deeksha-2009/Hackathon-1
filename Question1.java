import java.util.Scanner;

public class Question1
{

    static int calculateTotal(int morningUsage, int eveningUsage) 
    {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // 1a) Data Types
        int familyMembers = 4;
        double waterConsumed = 450.5;
        int houseNumber = 102;
        char usageStatus = 'N';

        System.out.println("HOUSEHOLD WATER DETAILS");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);

        // 1b) If-Else Condition
        System.out.print("\nEnter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int bill;

        if (consumption <= 500) 
        {
            bill = 100;
        } 
        else 
        {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        // 1c) Method
        System.out.print("\nEnter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + total + " litres");

        sc.close();
    }
}
