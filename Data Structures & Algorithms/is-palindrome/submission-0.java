class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb= new StringBuilder(clean);
        String s1=sb.reverse().toString();
        // System.out.println(s1+" "+" "+clean);
        return s1.equals(clean);
        
    }
}
