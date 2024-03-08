public class TypeCastingExample {
    public static void main(String[] args) {
        // Widening Casting (Implicit)
        int intValue = 10;
        double doubleValue = intValue; // Automatically converts int to double
        System.out.println("Widening Casting (Implicit): " + doubleValue);

        // Narrowing Casting (Explicit)
        double doubleNumber = 15.76;
        long longValue = (long) doubleNumber; // Explicitly converts double to long
        System.out.println("Narrowing Casting (Explicit): " + longValue);

        // Narrowing Casting with Potential Data Loss
        double largeDouble = 100.99;
        int smallInt = (int) largeDouble; // Explicitly converts double to int (fractional part lost)
        System.out.println("Narrowing Casting with Data Loss: " + smallInt);

        // Casting from decimal to integer
        double anotherDouble = 27.5;
        int anotherInt = (int) anotherDouble; // Explicitly converts double to int
        System.out.println("Casting from decimal to integer: " + anotherInt);
    }
}
