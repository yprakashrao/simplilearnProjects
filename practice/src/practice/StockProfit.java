package practice;

public class StockProfit {
    
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit can be made with less than 2 prices
        }
        int minPrice = prices[0]; // Initialize the minimum price as the price on the first day
        int maxProfit = 0; // Initialize maximum profit as 0
        
        for (int i = 1; i < prices.length; i++) {
            // Check if current price is lower than the previously known minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                // Calculate the profit by subtracting the minimum price from the current price
                int profit = prices[i] - minPrice;
                // Update maximum profit if the calculated profit is greater than the previous maximum
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum profit: " + profit);
    }
}

