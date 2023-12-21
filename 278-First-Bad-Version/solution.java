
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int low=1;
    int high=n;
    int x=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(isBadVersion(mid)==false){
            low=mid+1;
        }else if(isBadVersion(mid)==true){
            x=mid;
            high=mid-1;
        }
    }
    return x;
    }
}