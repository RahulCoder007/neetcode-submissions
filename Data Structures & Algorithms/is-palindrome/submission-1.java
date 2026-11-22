class Solution {
    public boolean isPalindrome(String s) {
        // String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        // StringBuilder sb= new StringBuilder(clean);
        // String s1=sb.reverse().toString();
        // // System.out.println(s1+" "+" "+clean);
        // return s1.equals(clean);
        
        
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n=s1.length();
        int i=0, j=n-1;
        while(i<j){
            if(s1.charAt(i++)!=s1.charAt(j--))
            return false;
        }
       return true;

    }
}
