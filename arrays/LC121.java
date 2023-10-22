package arrays;

public class LC121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len == 0)
            return 0;

        int minPrice = prices[0], ans = 0;
        for (int price : prices) {
            ans = Math.max(ans, price-minPrice);
            minPrice = Math.min(price, minPrice);
        }

        return ans;
    }
}
