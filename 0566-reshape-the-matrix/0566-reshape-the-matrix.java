class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row= mat.length;
        int col= mat[0].length;
        if (row*col!=r*c){
            return mat;
        }
        int new_mat[][] = new int[r][c];
        int newrow=0;
        int newcol=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                new_mat[newrow][newcol]=mat[i][j];
                newcol++;
                if (newcol==c){
                    newcol=0;
                    newrow++;
                }
            }
        }
        return new_mat;
    }
}