class Solution {
    public int maxArea(int[] heights) {
        if(heights.length<2) return 0;
        int area=0, maxArea=0;
        int dist=0, maxDist=0;
        int i=0, j=heights.length-1;
        // for(int x=0;x<heights.length-1;x++){
        //     for(int y=x+1;y<heights.length;y++){
        //         area=Math.min(heights[x],heights[y])*(y-x);

        //             maxArea=Math.max(area,maxArea);
        //             // System.out.println(maxArea);
                
                
        //     }
        // }
        // return maxArea;


        while(i<j){
            area=Math.min(heights[i],heights[j])*(j-i);
           maxArea=Math.max(area,maxArea);
            
            if(heights[i]<heights[j])
            i++;
            else
            j--;

        }
        return maxArea;
    }
}
