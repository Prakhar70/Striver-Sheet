class kadane {
    public int maxSubArray(int[] arr) {
        int oans=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            int choice1=curr+arr[i];
            int choice2=arr[i];
            curr=Math.max(choice1,choice2);
            oans=Math.max(oans,curr);
        }
        return oans;
    }
}