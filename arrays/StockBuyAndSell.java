public class StockBuyAndSell{
    public static void main(String[] args) {
        int prices[]={1,4,2,3,11,9};

        int min = prices[0];
        int profit = 0;
        // for(int i =0;i<prices.length;i++){
        //     if(prices[i]<min){
        //         min = prices[i];
        //         profit= Math.max(profit, prices[i]-min);
        //     }else{
        //         profit=Math.max(profit, prices[i]-min);
        //     }
        // }

        for(int p:prices){
            min = Math.min(min,p);
            profit= Math.max(p-min, profit);
        }

        System.out.println("profit: "+ profit);
    }
}