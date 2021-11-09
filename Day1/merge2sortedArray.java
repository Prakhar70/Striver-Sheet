
class merge2sortedArray
{
    //Function to merge the arrays.
   public static void merge(long nums1[], long nums2[], int n, int m) {
        for(int i=0;i<n;i++){
            if(nums1[i]>nums2[0]){
                swap(nums1,nums2,i,0);
                long tmp=nums2[0];
                for(int j=1;j<m;j++){
                    if(nums2[j]<tmp){
                        nums2[j-1]=nums2[j];
                    }
                    else{
                        nums2[j-1]=tmp;
                        break;
                    }
                }
            }
        }
        
    }
    private static void swap(long[] arr1,long[] arr2,int i,int j){
        long tmp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=tmp;
    }
   
}

//gap gapmethod
class Gap
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        for(int gap=(n+m)/2;gap>0;gap/=2){
            int i=0;
            int j=gap;
            while(i<n && j<n+m){
                if(j<n){
                    if(arr1[i]>arr1[j]){
                        swap(arr1,arr1,i,j);
                    }
                    
                }
                else{
                    int jdash=j-n;
                    if(arr1[i]>arr2[jdash]){
                        swap(arr1,arr2,i,jdash);
                    }
                    
                }
                i++;
                j++;
            }
            
        }
    }
    private static void swap(long[] arr1,long[] arr2,int i,int j){
        long temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }
}