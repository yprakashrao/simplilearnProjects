package practice;

public class WineDistribution {
    
    // Function to calculate minimum cost of distributing wine
    public static int calculateMinCost(int[] S) {
        int n = S.length;
        int cost = 0; // Initialize total cost

        // Pointers for finding surpluses and deficits
        int i = 0, j = 0;

        while (i < n && j < n) {
            // Find the next surplus (S[i] > 0)
            while (i < n && S[i] <= 0) i++;
            // Find the next deficit (S[j] < 0)
            while (j < n && S[j] >= 0) j++;

            // If we have reached the end, break the loop
            if (i == n || j == n) break;

            // Determine the minimum amount to transfer
            int transfer = Math.min(S[i], -S[j]);

            // Calculate the cost as transfer amount * distance
            cost += transfer * Math.abs(i - j);

            // Update the surplus and deficit after the transfer
            S[i] -= transfer; // Reduce surplus at i
            S[j] += transfer; // Reduce deficit at j
        }

        return cost; // Return the total minimum cost
    }

    public static void main(String[] args) {
        // Example array of surpluses (positive) and deficits (negative)
        int[] S = {5, -4, -3, 2, 0, 3, -3};

        // Calculate the minimum cost
        int minCost = calculateMinCost(S);

        // Output the result
        System.out.println("Minimum cost of distributing wine: " + minCost);
    }
}
