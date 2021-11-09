import java.util.*;
public class mergeInterval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]>list=new ArrayList<>();
        for(int[] interval:intervals){
            if(list.size()==0){
                list.add(interval);
            }
            int[] current=list.get(list.size()-1);
            int e1=current[1];
            int s2=interval[0];
            int e2=interval[1];
            if(e1>=s2){
                current[1]=Math.max(e1,e2);
            }else{
                list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
        
    }
}
