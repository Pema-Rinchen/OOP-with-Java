public class Calculator {
    private double operand1;
    private double operand2;

    // Setter methods
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    // Getter methods
    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    // Addition method
    public double addition() {
        return operand1 + operand2;
    }

    // Subtraction method
    public double subtraction() {
        return operand1 - operand2;
    }

    // Multiplication method
    public double multiplication() {
        return operand1 * operand2;
    }

    // Division method
    public double division() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return Not-a-Number for division by zero
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Set operands
        calculator.setOperand1(10);
        calculator.setOperand2(5);

        // Perform operations
        double sum = calculator.addition();
        double difference = calculator.subtraction();
        double product = calculator.multiplication();
        double quotient = calculator.division();

        // Print results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}
