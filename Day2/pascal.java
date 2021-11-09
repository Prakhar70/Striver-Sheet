
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        for(int n=0;n<numRows;n++){
            int ncr=1;
            ArrayList<Integer> subans=new ArrayList<>();
            for(int r=0;r<=n;r++){
                subans.add(ncr);
                ncr=ncr*(n-r)/(r+1);
            }
            ans.add(subans);
        }
        return ans;
    }
}
class pascal{
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.generate(5));
    }
}