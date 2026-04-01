class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();
        
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                
                char num = board[r][c];
                
                if(num != '.'){
                    
                    if(!set.add(num + " in row " + r) ||
                       !set.add(num + " in col " + c) ||
                       !set.add(num + " in box " + r/3 + "-" + c/3)){
                        
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}