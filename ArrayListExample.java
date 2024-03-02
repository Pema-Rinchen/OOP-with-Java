import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("pema");
        words.add("hi");
        words.add("world");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
        words.add(1, "go");
        words.remove("hi");
        System.out.println("\nWords after modification:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
