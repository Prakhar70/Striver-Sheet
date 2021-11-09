class Set0 {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean isRow=false;
        boolean isCol=false;
        boolean isIntial=(matrix[0][0]==0); 
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                isRow=true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0){
                isCol=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(isIntial){
            isRow=true;
            isCol=true;
        }
        if(isRow){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        if(isCol){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
        
    }
}