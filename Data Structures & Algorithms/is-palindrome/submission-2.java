class Solution {
    public boolean isPalindrome(String s) {
        // String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        // StringBuilder sb= new StringBuilder(clean);
        // String s1=sb.reverse().toString();
        // // System.out.println(s1+" "+" "+clean);
        // return s1.equals(clean);
        
        
    //     String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
    //     int n=s1.length();
    //     int i=0, j=n-1;
    //     while(i<j){
    //         if(s1.charAt(i++)!=s1.charAt(j--))
    //         return false;
    //     }
    //    return true;

       int n=s.length();
       int i=0, j=n-1;
       while(i<j){
        while(i<j && !Character.isLetterOrDigit(s.charAt(i))) //[",."]
        i++;
        while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
        j--;
        // if(s.toLowerCase().charAt(i++)!=s.toLowerCase().charAt(j--)){// Calling s.toLowerCase() inside a while loop creates a brand-new copy of the entire string on every single iteration (\(O(n^2)\) time and \(O(n)\) space)
        if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))
            return false;
        }
       
        return true;

    }
}
