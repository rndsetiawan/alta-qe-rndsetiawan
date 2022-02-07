public class P1N6_Palindrome {
    private static boolean palindrome(String value) {
        char[] charArray = value.toCharArray();
        int length = value.length();
        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
