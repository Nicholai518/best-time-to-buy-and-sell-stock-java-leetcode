public class Solution {
    public int maxProfit(int[] prices) {
        // variables
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        // iterate through the array
        for (int i = 0; i < prices.length; i++) {

            // if the current element is less than min value, update
            if (prices[i] < minValue) {
                minValue = prices[i];
            }

            // otherwise if the current element - the known minimum value is greater than max profit
            // update max profit
            else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}
