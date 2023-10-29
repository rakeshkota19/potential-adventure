package bs;

public class LC50 {
    public double myPow(double x, long n) {
        double ans = 0;

        if (n < 0) {
            n*=-1;
            x = 1/x;
        }

        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        if (n%2 == 0) {
            double tmp = myPow(x, n/2);
            return tmp*tmp;
        } else {
            double tmp = myPow(x, n/2);
            return tmp*tmp*x;
        }
    }
}
