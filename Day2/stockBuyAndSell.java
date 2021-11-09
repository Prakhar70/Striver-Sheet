class stockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int oans=0;
        int mtn=prices[0];//minimun till now
        int pist=0;//profit if sold today
        for(int i=0;i<prices.length;i++){
            mtn=Math.min(mtn,prices[i]);
            pist=prices[i]-mtn;
            oans=Math.max(pist,oans);
        }
        return oans;
    }
    public static void main(String[] args) {
        int[] prices={-39957,-17136,35466,21820,-26711};
        System.out.println(maxProfit(prices));

    }
}