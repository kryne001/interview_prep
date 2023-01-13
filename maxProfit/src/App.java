public class App {
    public int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (minCost > prices[i])
            {
                minCost = prices[i];
            }
            else if (prices[i] - minCost > maxProfit)
            {
                maxProfit = prices[i] - minCost;
            }
        }

        if (maxProfit > 0)
        {
            return maxProfit;
        }
        else 
        {
            return 0;
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
