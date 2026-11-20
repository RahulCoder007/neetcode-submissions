class Solution {

    public String encode(List<String> strs) {
        // String newStr=String.join(" ",strs);
        StringBuilder sb= new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        //  System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        // String[] arr=str.split(" ");
        // List<String> newStrs= Arrays.asList(arr);
        List<String> newStrs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            
            while(str.charAt(j)!='#'){
                j++;//1
            }
            int len=Integer.parseInt(str.substring(i,j));//5
            i=j+1;
            newStrs.add(str.substring(i,i+len));

            //move i to next word
            i+=len;
        }

        // System.out.println(newStrs);
        return newStrs;
        
    }
}
