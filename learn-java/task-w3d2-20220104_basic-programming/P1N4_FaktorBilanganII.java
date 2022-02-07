public class P1N4_FaktorBilanganII {
    public static void main (String[] args){
        int bilangan = 1989;

        for (int i=bilangan; i>=1; i--){
            if (bilangan%i == 0){
                System.out.println(i);
            }
        }
    }
}
