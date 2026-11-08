class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m)
            return false;

            //O(n2)
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
        //str->arr
        char[] sSort=s.toCharArray();
        char[] tSort=t.toCharArray();

        //sort
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort,tSort);
    }
}
