class BestTimeButSellStocks {
    public static void main(String[] args) {
        BestTimeButSellStocks bestTime = new BestTimeButSellStocks();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(bestTime.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}