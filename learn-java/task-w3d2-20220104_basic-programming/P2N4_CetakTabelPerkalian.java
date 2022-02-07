public class P2N4_CetakTabelPerkalian {
    private static void CetakTabelPerkalian(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CetakTabelPerkalian(7);
    }
}
