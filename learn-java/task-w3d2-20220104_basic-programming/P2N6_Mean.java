public class P2N6_Mean {
    private static float Rata(float[] bilangan) {
        float jumlah = 0;
        for (int i = 0; i < bilangan.length; i++) {
            jumlah += bilangan[i];
        }
        return jumlah / bilangan.length;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println("Mean nya adalah " + Rata(value));
    }
}
