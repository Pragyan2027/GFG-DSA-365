// User function Template for Java

class Sol {
    public static int maxOnes(int Mat[][], int N, int M) {
        // your code here
         int maxRow = -1;
        int col = M-1;
        int row = 0;
        
        while(row < N && col >=0){
            if(Mat[row][col] == 1){
                maxRow = row;
                col--;
            }else{
                row++;
            }
        }
        return maxRow;
    }
}