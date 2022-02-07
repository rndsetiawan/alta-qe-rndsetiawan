public class P1N3_FaktorBilangan {
    public static void main(String[] args) {
        int bilangan = 30;

        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
