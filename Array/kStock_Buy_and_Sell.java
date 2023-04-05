package Array;

public class kStock_Buy_and_Sell {

    public static int BuySell(int price[]){

        int buyingpice = Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0; i<price.length; i++){
            if(buyingpice<price[i]){
                int profit= price[i]-buyingpice;
                maxprofit = Math.max(maxprofit, price[i]);
            }else{
                buyingpice= price[i];

            }
        }
        return maxprofit;
    }

    public static void main(String args[]){

        int price[]= {7,1,5,3,6,4};

        System.out.println("Max Profit: "+ BuySell(price));

    }
}
