class uniquePaths {
    public int uniquePaths1(int m, int n) {
        return nCr(m+n-2,n-1);
    }
    private int nCr(int n,int r){
        double num=1;
        for(int i=0;i<r;i++){
            num=num*(n-i)/(i+1);
        }
        return (int)num;
        
    }
}
//1 test case not working