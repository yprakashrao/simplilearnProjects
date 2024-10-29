package practice;

public class BestTimeToBuyAndSellStocks {

    // Method to calculate maximum profit
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to max value
        int maxProfit = 0; // Initialize maxProfit to 0

        // Iterate through the array of prices
        for (int price : prices) {
            // Update minPrice if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate potential profit and update maxProfit if needed
            int potentialProfit = price - minPrice;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }

        return maxProfit; // Return the maximum profit
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example prices
        System.out.println("Max Profit: " + maxProfit(prices)); // Output: 5
    }
}

