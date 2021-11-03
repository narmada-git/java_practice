package dsa;

public class CountDigits {

    public static void main(String[] args) {
        int n = 43872;
        CountDigits countDigits = new CountDigits();
        int ans = countDigits.findCountDigit(n);
        System.out.println("ans = " + ans);
    }

    int findCountDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

}
