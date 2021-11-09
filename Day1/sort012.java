class sort012 {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1;
        int curr=0;
        while(curr<=high){//imp
            if (nums[curr]==0){
                swap(nums,low,curr);
                curr++;
                low++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                swap(nums,curr,high);
                high--;
            }
        }  
    }
    private static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}