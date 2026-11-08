class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m)
            return false;

        // O(n2)
        // int ct = 0;
        // boolean[] visited = new boolean[n];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (s.charAt(i) == t.charAt(j) && !visited[j]) {
        //             ct++;
        //             visited[j] = true;
        //             break;
        //         }
        //     }
        // }
        // return ct == n;

        /********O(nlogn + mlogm)*********/
        // str->arr
        // char[] sSort = s.toCharArray();
        // char[] tSort = t.toCharArray();

        // // sort
        // Arrays.sort(sSort);
        // Arrays.sort(tSort);

        // return Arrays.equals(sSort, tSort);

        /********O(n + m)*********/

    Map<Character,Integer> hm1=new HashMap<>();
    Map<Character,Integer> hm2=new HashMap<>();

    for(int i=0;i<n;i++){
      int v1=hm1.getOrDefault(s.charAt(i),0)+1;// for the specific key gets the curr_value if exist or by default 0 and add 1 to that value 
        hm1.put(s.charAt(i),v1);
        int v2=hm2.getOrDefault(t.charAt(i),0)+1;
        hm2.put(t.charAt(i),v2);
    }
    // System.out.println(hm1+" "+hm2);
    return hm1.equals(hm2);
}
}