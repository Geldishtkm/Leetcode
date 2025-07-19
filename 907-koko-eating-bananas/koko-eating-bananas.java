class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return bananas(piles,h);
    }
    int bananas(int[] piles,int h){
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int result=r;
        while(l<=r){
            int total=0;
            int mid=(l+r)/2;
        for(int pile : piles){
            total+=Math.ceil((double)pile/mid);
        }
        if(total<=h){
            result=mid;
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        
    }
    return result;
    }
}
