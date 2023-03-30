public class subtractprodsum {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int p = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            p = p * rem;
            n = n / 10;

        }
        return p - sum;
    }
}
