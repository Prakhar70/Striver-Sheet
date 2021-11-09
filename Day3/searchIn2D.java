//leetcode
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=n*m -1;
        while(i<=j){
            int mid=i+((j-i)/2);
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            else if(matrix[mid/m][mid%m]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
        
    }
}

//geeks for geeks
class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int j=M-1;
        int i=0;
        while(i<N && j>=0){
            if(mat[i][j]==X){
                return 1;
            }
            else if(mat[i][j]<X){
                i++;
            }
            else{
                j--;
            }
        }
        return 0;
    }
}