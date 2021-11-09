class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])]>0){
                nums[Math.abs(nums[i])]=-nums[Math.abs(nums[i])];
            }
            else{
                return Math.abs(nums[i]);
            }
        }
        return 0;
    }
}
//cycle detection method;
class Solutionalte {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}