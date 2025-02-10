import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int x = 3; // Class variable

    public static void main(String[] args) {

        int x = 4; // Local variable

        System.out.println(x);

        // printPrimitiveVariables();
        // processScanner();
        // calculateAreaRectangle();
        // processMadLibsGame();
        // processArithmeticOperators();
        // processAugmentedAssigmentOperators();
        // processOrderOfOperations();
        // shoppingCartProgram();
        // processRandomNumbers();
        // processMathFunctions();
        // calculateHypotenuse();
        // calculateCircumferenceAreaVolume();
        // processPrintf();
        // calculateCompoundInterest();
        // processStringMethods();
        // processSubstringMethod();
        // weightConversion();
        // processTernaryOperator();
        // temperatureConversion();
        // processEnhancedSwitch();
        // simpleCalculator();
        // processLogicalOperators();
        // processWhile();
        // processDoWhile();
        // numberGuessingGame();
        // processOverloadedMethods();
        // processOverloadedMethodsWithPizza();
    }

    private static void processOverloadedMethodsWithPizza() {

        // overloading methods
        String pizza = bakePizza("flat bread", "mozzarella", "sucuk");

        System.out.println(pizza);
    }

    private static String bakePizza(String bread) {
        return bread + " pizza";
    }

    private static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    private static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }

    private static void processOverloadedMethods() {
        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    private static void numberGuessingGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 10;
        int randomNumber = random.nextInt(min, max);
        int guess;
        int attempts = 0;

        do {
            System.out.printf("Guess a number between %d and %d: ", min, max);
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Guess is too high.");
            } else {
                System.out.printf("You guessed correctly %d in %d attempts\n", guess, attempts);
            }
        } while (randomNumber != guess);

        scanner.close();
    }

    private static void processDoWhile() {
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        do {
            System.out.println("Age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.printf("Your age is %d\n", age);

        scanner.close();
    }

    private static void processWhile() {
        Scanner scanner = new Scanner(System.in);

        String response = "";
        while(!response.equals("Q")) {
            System.out.print("You are playing a game. Press Q to quit. ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game.");

        scanner.close();
    }

    private static void processLogicalOperators() {
        double temp = 20;

        if (temp <= 30 && temp >= 0) {
            System.out.println("The weather is good");
        }
    }

    private static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator(+, -. *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.printf("The result is %.2f", result);
        }

        scanner.close();
    }

    private static void processEnhancedSwitch() {
        System.out.print("Enter the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }

    private static void temperatureConversion() {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("New temperature in %s is %.1f", unit, newTemp);


        scanner.close();
    }

    private static void processTernaryOperator() {
        int score = 70;

        String status = score >= 60 ? "Pass" : "Fail";
        System.out.println(status);

        int number = 3;
        String evenOrOdd = number % 2 == 0 ? "even" : "odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = hours < 12 ? "AM" : "PM";
        System.out.println(timeOfDay);
    }

    private static void weightConversion() {
        // Declare variables
        // Welcome message
        // Prompt for user choice
        // Option 1 convert lbs to kgs
        // Option 2 convert kgs to lbs
        // else not a valid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;

            System.out.printf("New weight in kgs is %.2f", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;

            System.out.printf("New weight in lbs is %.2f", newWeight);
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }

    private static void processSubstringMethod() {
        String email;
        String username;
        String domain;

        email = "Bro123@gmail.com";
        username = email.substring(0, 6);
        domain = email.substring(7);
        System.out.println(username);
        System.out.println(domain);

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println(username);
        System.out.println(domain);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.printf("Email is %s. Username is: %s, Domain is: %s", email, username, domain);
        } else {
            System.out.println("Email is not valid");
        }

        scanner.close();
    }

    private static void processStringMethods() {
        String name = "Bro Code";

        int length = name.length();
        System.out.println("Length: " + length);

        char letter = name.charAt(0);
        System.out.println("Chart at: " + letter);

        int index = name.indexOf(" ");
        System.out.println("Index: " + index);

        int lastIndex = name.lastIndexOf("o");
        System.out.println("Last Index: " + lastIndex);

        name = name.toUpperCase();
        System.out.println("Name: " + name);

        name = name.toLowerCase();
        System.out.println("Name: " + name);

        name = "   Bro Code   ";
        name = name.trim();
        System.out.println("Name: " + name);

        name = name.replace("o", "a");
        System.out.println("Name: " + name);

        System.out.println(name.isEmpty());
        name = "";
        System.out.println(name.isEmpty());

        name = "Bro Code";
        System.out.println(name.contains(" "));
        System.out.println(name.contains("a"));
        System.out.println(name.equals("password"));
        System.out.println(name.equals("bro code"));
        System.out.println(name.equalsIgnoreCase("bro code"));
    }

    private static void calculateCompoundInterest() {
        double finalAmount; // Final amount
        double principle; // Initial principal balance
        double rate; // interest rate
        int timesCompounded; // number of times interest applied per time period
        int years; // number of time periods elapsed

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial principal balance: ");
        principle = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        finalAmount = principle
                * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
        System.out.printf("The amount after %d years is $%.2f\n", years, finalAmount);
    }

    private static void processPrintf() {
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old.\n", name, age);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.3f\n", price1);
        System.out.printf("%+.3f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.2f\n", price3);

        double price4 = 9000.99;
        double price5 = 100000.15;
        System.out.printf("%,.2f\n", price4);
        System.out.printf("%,.2f\n", price5);

        double price6 = 90.99;
        double price7 = -10.15;
        System.out.printf("%(.2f\n", price6);
        System.out.printf("%(.2f\n", price7);

        double price8 = 90.99;
        double price9 = -10.15;
        System.out.printf("% .2f\n", price8);
        System.out.printf("% .2f\n", price9);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }

    private static void calculateCircumferenceAreaVolume() {
        // circumference = 2 * pi * radius
        // area = pi * pow(radius, 2)
        // volume = (4.0 / 3.0) * pi * pow(radius, 3)

        double circumference;
        double radius;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circumference: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference %.1f \n", circumference);

        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area %.1f\n", area);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume %.1f\n", volume);

        scanner.close();
    }

    private static void calculateHypotenuse() {
        // c = Math.sqrt(a2 + b2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }

    private static void processMathFunctions() {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2, 4);
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(9);
        System.out.println(result);

        result = Math.round(3.14);
        System.out.println(result);

        result = Math.round(3.64);
        System.out.println(result);

        result = Math.ceil(3.14);
        System.out.println(result);

        result = Math.floor(3.14);
        System.out.println(result);

        result = Math.max(10, 20);
        System.out.println(result);

        result = Math.min(10, 20);
        System.out.println(result);
    }

    private static void processRandomNumbers() {
        Random random = new Random();
        int number;
        number = random.nextInt(1, 6);
        System.out.println(number);

        int number1 = random.nextInt(1, 7);
        int number2 = random.nextInt(1, 7);
        int number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double number4 = random.nextDouble();
        System.out.println(number4);

        boolean isHeads = random.nextBoolean();
        System.out.println(isHeads);
        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }

    private static void shoppingCartProgram() {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item do you want to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("You have bought " + item + " " + currency + " " + total);

        scanner.close();
    }

    private static void processOrderOfOperations() {
        // Order of Operations [PEMDAS]
        // = Parentheses Exponents Multiplication Division Addition Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }

    private static void processAugmentedAssigmentOperators() {
        int x = 10;
        int y = 3;

        x += y;
        x -= y;

        System.out.println(x);

        double a = 10;
        double b = 3;

        a /= b;

        System.out.println(a);

        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
    }

    private static void processArithmeticOperators() {
        int x = 10;
        int y = 3;
        int z;

        z = x + y;
        z = x - y;
        z = x % y;

        System.out.println(z);
    }

    private static void processMadLibsGame() {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing(action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1);
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }

    private static void printPrimitiveVariables() {
        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println("The year is " + year);

        double price = 19;
        double gpa = 3.5;
        double temperature = -21.99;

        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = false;
        System.out.println(forSale);

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not student");
        }

        String name = "John Doe";
        System.out.println("Name is " + name);
    }

    private static void processScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();

        // System.out.print("Enter your name: ");
        // String name2 = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name1 + "!");
        // System.out.println("Hello, " + name2 + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your favourite color?: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite color is " + color + ".");

        scanner.close();
    }

    private static void calculateAreaRectangle() {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + " cm2");

        scanner.close();
    }
}
