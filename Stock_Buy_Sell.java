class Main {
    public static void main(String[] args) {
        // Example input: stock prices on consecutive days
        int[] prices = {7, 2, 1, 5, 3, 6, 4};
        
        // Call the maxProfit method to calculate the maximum profit
        int profit = maxProfit(prices);
        
        // Output the maximum profit
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        // Initialize minPrice to the maximum possible integer value
        // This will help track the lowest price seen so far
        int minPrice = Integer.MAX_VALUE;

        // Initialize maxProfit to 0
        // This will store the maximum profit calculated so far
        int maxProfit = 0;

        // Loop through each day's price
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than the minPrice, update minPrice
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }

            // Calculate the profit if the stock is sold on the current day
            int profit = prices[i] - minPrice;

            // If the calculated profit is greater than maxProfit, update maxProfit
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit obtained
        return maxProfit;
    }
}
