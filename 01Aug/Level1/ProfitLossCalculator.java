public class ProfitLossCalculator {
    public static void main(String[] args) {
        float costPrice = 129f;
        float sellingPrice = 191f;
        float profit = sellingPrice - costPrice;
        float profitPercentage = (profit / costPrice) * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
