//QUESTION-->
//You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

//ANSWER-->
class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        for(int i=0;i<prices.length;i++){
            if(prices[0]>prices[i]){
                prices[0]=prices[i];
            }
             sum=Math.max(sum,prices[i]-prices[0]);
        }
        return sum;
    }
}