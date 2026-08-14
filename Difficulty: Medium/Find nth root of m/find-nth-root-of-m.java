class Solution {
    public int nthRoot(int n, int m) {
        int x=0;
        while(Math.pow(x,n)<=m){
            if(Math.pow(x,n)==m){
                return x;
            }
            x++;
        }
        return -1;
    }
}