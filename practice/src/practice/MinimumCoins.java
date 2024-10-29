package practice;

import java.util.Arrays;

public class MinimumCoins {
    // Method to find the minimum number of coins
    public static int minCoins(int[] coins, int amount) {
        // Sort the coin denominations in descending order
        Arrays.sort(coins);
        int count = 0; // To count the number of coins used
        int index = coins.length - 1; // Start from the largest coin

        while (amount > 0 && index >= 0) {
            // While the coin value is less than or equal to the remaining amount
            while (coins[index] <= amount) {
                amount -= coins[index]; // Subtract the coin value from amount
                count++; // Increment the coin count
            }
            index--; // Move to the next largest coin
        }

        // If amount is not zero, it means it's not possible to form that amount with given coins
        return (amount == 0) ? count : -1; // Return -1 if not possible
    }

    // Main method to test the minCoins function
    public static void main(String[] args) {
        int[] coins = {1, 3, 4}; // Available coin denominations
        int amount = 6; // Target amount

        int result = minCoins(coins, amount);
        if (result != -1) {
            System.out.println("Minimum number of coins needed: " + result);
        } else {
            System.out.println("Cannot form the given amount with the available coins.");
        }
    }
}

