import java.util.Scanner;
public class csc303_lab02_fundamentals {
    double csc303 = 34;
    double csc304 = 88;
    double csc305 = 99;
    double avg() {
        return (csc303 + csc304 + csc305) / 3;
    }
    public static void main(String[] args){
        //EXERCISE 2.1
        System.out.println("Byte size: " + Byte.SIZE + " bits, range " + Byte.MIN_VALUE +
                " .. " + Byte.MAX_VALUE);
        System.out.println("Short size: " + Short.SIZE + " bits, range " + Short.MIN_VALUE +
                " .. " + Short.MAX_VALUE);
        //EXERCISE 2.2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        double csc303 = 34;
        double csc304 = 88;
        double csc305 = 99;
        System.out.println("Enter your CA Score (Out of 40): ");
        double ca = input.nextDouble();
        System.out.println("Enter your Exam Score (Out of 60): ");
        double exam = input.nextDouble();

        double Total = ca + exam;
        boolean Passed = Total >=45;
        System.out.printf("%nHello %s! Your total is %.2f/100.%n", name, Total);
        System.out.println("Passed : " + Passed);
        //post lab
                while (true) {
                    System.out.println("\n==================================");
                    System.out.println("        UNIT LOAD ADVISOR         ");
                    System.out.println("==================================");

                    System.out.print("Enter your level (Enter 0 to quit): ");
                    int level = input.nextInt();

                    // Exit condition if they type 0
                    if (level == 0) {
                        System.out.println("Exiting advisor. Good luck with your semester!");
                        break;
                    }

                    System.out.print("Enter total course units you intend to register: ");
                    int units = input.nextInt();

                    // Check if units is also 0 to exit
                    if (units == 0) {
                        System.out.println("Exiting advisor. Good luck with your semester!");
                        break;
                    }

                    // Conditional check for overloading (< 15 or > 24)
                    if (units < 15 || units > 24) {
                        System.out.println("\n[!] WARNING: You have " + units + " units.");
                        System.out.println("Your load is either below 15 or above 24 units. Please consult your academic adviser to avoid carryovers or burnout!");
                    } else {
                        System.out.println("\n[✓] GREAT WORK: " + units + " units is a balanced, solid workload for your level. Keep pushing for those A's!");
                    }
                }

                input.close();
    }
}