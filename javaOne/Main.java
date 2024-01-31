import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Nodo!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Temperature");
            System.out.println("2. Check if a number is even");
            System.out.println("3. Calculate wall's area");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.println("2. Celsius to Fahrenheit");

                    int temperature_choice = scanner.nextInt();

                    switch (temperature_choice) {
                        case 1:
                            System.out.print("Enter Fahrenheit temperature: ");
                            float fahrenheit = scanner.nextFloat();
                            System.out.println("Equivalent Celsius temperature: " + fahrenheitToCelsius(fahrenheit));
                            break;
                        case 2:
                            System.out.print("Enter Celsius temperature: ");
                            float celsius = scanner.nextFloat();
                            System.out.println("Equivalent Fahrenheit temperature: " + celsiusToFahrenheit(celsius));
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (isEven(number)){
                        System.out.println(number + " is even");
                    }else{
                        System.out.println(number + " is odd");
                    }
                    break;
                case 3:
                    System.out.print("Length of the wall: ");
                    float length = scanner.nextFloat();
                    System.out.print("Width of the wall: ");
                    float width = scanner.nextFloat();
                    System.out.println("Wall's area:" + area(length, width));
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    //Temperatures:
    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    //Even or odd number:
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //Wall's area:
    public static float area(float length, float width) {
        return length * width;
    }


    
}