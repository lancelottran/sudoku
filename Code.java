boolean sudoku2(char[][] grid) {

    if(grid.length < 9)
        return false;
    
    for(int r = 0; r < 9; r++)
    {
        char[] row = new char[9];
        char[] square = new char[9];
        char[] col = grid[r].clone();
            
        for(int c = 0; c < 9; c++)
        {
            row[c] = grid[c][r];
            
            square[c] = grid[(r/3)*3+c/3][r*3%9+c%3];
        }
        
        if(!(isUnique(row) && isUnique(col) & isUnique(square)))
            return false;
    }
    
    return true;
}


boolean isUnique(char[] check){
    boolean[] unique_array = new boolean[9];
    
    for(int i = 0; i < check.length; i++)
    {
        if(check[i] != '.')
        {
            if(unique_array[check[i]-'1'] == false)
                unique_array[check[i]-'1'] = true;
            else
                return false;
        }
    }
    
    return true;
}
