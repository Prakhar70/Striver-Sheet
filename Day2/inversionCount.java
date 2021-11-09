public class inversionCount {
    static int count=0;
    
    public static void main(String[] args) {
        int arr[]={8,4,2,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }

    public static int[] mergeSort(int[] arr, int i, int j) {
        if(i==j){
            return new int[]{arr[i]};
        }
        int mid=(i+j)/2;
        int[] left=mergeSort(arr, i, mid);
        int[] right=mergeSort(arr, mid+1, j);
        int[] ans=mergeTwoSorted(left,right);
        return ans;
    }

    private static int[] mergeTwoSorted(int[] left, int[] right) {
        int n=left.length;
        int m=right.length;
        int[] ansArr=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(left[i]<right[j]){

                ansArr[k++]=left[i++];
            }
            else if(left[i]>right[j]){
                count+=n-i;
                ansArr[k++]=right[j++];
            }
        }
        while(i<n){
            ansArr[k++]=left[i++];
        }
        while(j<m){
            ansArr[k++]=right[j++];
        }
        return ansArr;
    }
}
