class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int ans[] = new int[n];
        int index = n-1;
        while(i<=j){
            int leftsquare = nums[i]*nums[i];
            int rightsquare = nums[j]*nums[j];
            if(leftsquare > rightsquare){
                ans[index] = leftsquare;
                i++;
            }
            else{
                ans[index] = rightsquare;
                j--;
            }
            index--;
        }
        return ans;

    }
}