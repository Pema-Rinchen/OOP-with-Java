import java.util.Vector;

public class IntegerCollection {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(5);
        integerVector.add(1);
        integerVector.add(10);
        integerVector.add(15);
        integerVector.add(1);
        integerVector.add(20);

        System.out.println("Before removing 1:");
        for (Integer num : integerVector) {
            System.out.println(num);
        }
        integerVector.remove(Integer.valueOf(1));

        System.out.println("\nAfter removing 1:");
        for (Integer num : integerVector) {
            System.out.println(num);
        }
    }
}
