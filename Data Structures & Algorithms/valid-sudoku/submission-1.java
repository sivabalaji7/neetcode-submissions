class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=8,col=8;
        while(row>=0){
            int[] freq=new int[10];
            for(int i=0;i<9;i++)
            {
                int ch=board[row][i]-'0';
                if(ch>0&&ch<10){
                    freq[ch]+=1;
                }
                else if(ch==-2) continue;
                else{
                    return false;
                } 
            }
            for(int item:freq){
                if(item>1){
                    return false;
                }
            }
            row--;
        }
        while(col>=0){
            int[] freq=new int[10];
            for(int j=0;j<9;j++)
            {
                int ch=board[j][col]-'0';
                if(ch>0&&ch<10){
                    freq[ch]+=1;
                }
                else if(ch==-2) continue;
                else{
                    return false;
                } 
            }
            for(int item:freq){
                if(item>1){
                    return false;
                }
            }
            col--;
        }
        int ch=0;
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                int[] freq=new int[10];
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        ch=board[i+k][j+l]-'0';
                        if(ch>0&&ch<10){
                            freq[ch]+=1;
                        }
                        else if(ch==-2) continue;
                        else{
                            return false;
                        }
                }
            }
            for(int item:freq){
                    if(item>1) return false;
            }
        }
    }
    return true;
}
}
