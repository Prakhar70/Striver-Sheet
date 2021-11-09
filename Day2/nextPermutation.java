public class nextPermutation {
    public void nextPermutation1(int[] nums) {
        int n=nums.length;
        int i=0;
        int idx1=-1,idx2=-1;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1==-1){
            reverse(nums,idx1+1,n-1);
            return;
        }
        for(i=n-1;i>=0;i--){
            if(nums[i]>nums[idx1]){
                idx2=i;
                break;
            }
        }
        swap(nums,idx1,idx2);
        reverse(nums,idx1+1,n-1);
    }
    private static void swap(int[] nums,int idx1,int idx2){
        int tmp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=tmp;
    }
    private static void reverse(int nums[],int idx1,int idx2){
        while(idx1<idx2){
            swap(nums,idx1,idx2);
            idx1++;
            idx2--;
        }
    }
}