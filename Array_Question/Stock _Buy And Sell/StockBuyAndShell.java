
public class StockBuyAndShell {

    public static int maxProfit(int stock_price[]){
        int maxProfit = 0;
        int bestBuy = stock_price[0];

        for(int i = 1; i<stock_price.length; i++){

            if (stock_price[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, stock_price[i] - bestBuy);
            }

            bestBuy = Math.min(stock_price[i], bestBuy);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stock_price[] = {7, 1, 5, 3, 6, 4};
       System.out.println( "max profit :" +maxProfit(stock_price));

 }
}
