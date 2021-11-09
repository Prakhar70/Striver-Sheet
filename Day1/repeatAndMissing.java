
public class repeatAndMissing {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int xxory=0;
        for(int i=0;i<A.length;i++){
            xxory^=A[i];
        }
        for(int i=1;i<=A.length;i++){
            xxory^=i;
        }
        int rightMostSet=xxory&-(xxory);
        int x=0;
        int y=0;
        for(int i=0;i<A.length;i++){
            if((A[i]&rightMostSet)==0){
                x=x^A[i];
            }
            else{
                y=y^A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==x){
                return new int[]{x,y};
            }
        }
        return new int[]{y,x};
    }
}
