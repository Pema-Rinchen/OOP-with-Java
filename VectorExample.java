import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> words = new Vector<>();
        words.add("hey");
        words.add("you");
        words.add("sup");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
        words.add(1, "go");
        words.remove("sup");
        System.out.println("\nWords after modification:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
