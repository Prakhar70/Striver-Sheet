class rotate2D {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix,n);
        mirror(matrix,n);
    }
    private void transpose(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
    }
    private void mirror(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                swap(matrix[i],j,n-j-1);
            }
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}