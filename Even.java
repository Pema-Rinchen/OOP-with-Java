public class Even {
    public static void main(String[] args) {
        int[] even = new int[50];
        int[] odd = new int[50];
        int evenIndex = 0;
        int oddIndex = 0;
        int i = 0;
        while (i < 100 && evenIndex < 50 && oddIndex < 50) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
            i++;
        }
        System.out.println("Even Numbers:");
        for (i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }
    }
}
