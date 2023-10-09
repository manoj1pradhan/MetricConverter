import java.util.Scanner;

class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char convertAgain;

        do {
            double meters;

            do {
                System.out.print("Enter a measurement in meters: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
                meters = scanner.nextDouble();
                if (meters < 0) {
                    System.out.println("Measurement must be non-negative.");
                }
            } while (meters < 0);

            double miles = meters * 0.000621371;
            double feet = meters * 3.28084;
            double inches = meters * 39.3701;

            System.out.printf("%.2f meters is equivalent to:%n", meters);
            System.out.printf("%.2f miles%n", miles);
            System.out.printf("%.2f feet%n", feet);
            System.out.printf("%.2f inches%n", inches);

            System.out.print("Convert another measurement? (Y/N): ");
            convertAgain = scanner.next().charAt(0);
        } while (convertAgain == 'Y' || convertAgain == 'y');

        System.out.println("Thanks for using the Measurement Converter!");
        scanner.close();
    }
}
