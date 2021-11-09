
class moorevotingAlgo {
    public double myPow(double x, int n) {
        double ans=pow(x,Math.abs(n));
        return (n>0)?ans:(double)1/ans;
    }
    public double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double xnb2=pow(x,n/2);
        return (n%2==0)?xnb2*xnb2:xnb2*xnb2*x;
    }
}