class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row= new HashSet[9];//[null,null,...]
        Set<Character>[] col= new HashSet[9];
        Set<Character>[] box= new HashSet[9];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<>(); //[[],[],...]
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char d=board[r][c];
                int b=(r/3)*3+c/3;
                if(d!='.'){
                    if(row[r].contains(d) || col[c].contains(d) || box[b].contains(d)){
                        return false;
                    }
                row[r].add(d);
                col[c].add(d);
                box[b].add(d);

                }
            }
        }
        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));
        // System.out.println(Arrays.toString(box));
            return true;
    }
}
