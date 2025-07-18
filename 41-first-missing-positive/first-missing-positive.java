class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans=solver(nums);
        return ans;
        
    }
    int solver(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
            }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
        }
        }
            return arr.length+1;
    }
    void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
