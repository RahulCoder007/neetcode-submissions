class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen=new HashSet<>();
       

        // Set<Character>[] row= new HashSet[9];//[null,null,...]
        // Set<Character>[] col= new HashSet[9];
        // Set<Character>[] box= new HashSet[9];

        // for(int i=0;i<9;i++){
        //     row[i]=new HashSet<>(); //[[],[],...]
        //     col[i]=new HashSet<>();
        //     box[i]=new HashSet<>();
        // }

        // for(int r=0;r<9;r++){
        //     for(int c=0;c<9;c++){
        //         char d=board[r][c];
        //         int b=(r/3)*3+c/3;
        //         if(d!='.'){
        //           if(!seen.add(d+ "at row" + r) || !seen.add(d+" at col" + c) || !seen.add(d+" at box" + r/3 + "-" + c/3)){
        //             // if(row[r].contains(d) || col[c].contains(d) || box[b].contains(d)){
        //                 return false;
        //             }
        //         // row[r].add(d);
        //         // col[c].add(d);
        //         // box[b].add(d);

        //         }
        //     }
        // }
        // //  System.out.println(seen);
        // // System.out.println(Arrays.toString(row));
        // // System.out.println(Arrays.toString(col));
        // // System.out.println(Arrays.toString(box));
        //     return true;

    /*******using bit mask same TC but space O(n)*******/
    int[] row=new int[9];
    int[] col=new int[9];
    int[] box= new int[9];

    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char d=board[i][j]; //digit
            int b=(i/3)*3+j/3;
            int bit=1<<d-'0';//set the bit idx to 1 at that place of d
            if(d!='.'){
                // Check if this bit is already set in row, col, or box
                if((row[i] & bit)!=0 || (col[j] & bit)!=0 || (box[b] & bit) != 0){
                    return false;
                }
                row[i]|=bit;
                col[j]|=bit;
                box[b]|=bit;
            }

        }
    }
    return true;

    }
}
