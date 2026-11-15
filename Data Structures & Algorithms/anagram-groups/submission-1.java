class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> m = new HashMap<>();

        /*******O(m*nlogn)********/
        // for (String str : strs) {
        //     // convert word in char array and sorted its letter
        //     char[] ch = str.toCharArray();
        //     // System.out.println(Arrays.toString(ch));
        //     Arrays.sort(ch);
        //     // Why String is required for a Map key: In Java, two char[] arrays with the exact same letters (['a', 'e', 't'] and ['a', 'e', 't']) are considered different keys in a HashMap because arrays compare memory locations, not contents. Converting them into a String ensures "aet".equals("aet") is always true
        //     String sortedKeys = new String(ch);
        //     //  System.out.println(sortedKeys);
        //     // create a new list if same key not present
        //     m.putIfAbsent(sortedKeys, new ArrayList<>());
        //     m.get(sortedKeys).add(str);
        // }
        // return new ArrayList<>(m.values());

        for(String str: strs){
            int[] count=new int[26];
            for(char c : str.toCharArray())
            count[c-'a']++;
//convert str same array content but java compares them as diff mem addres
           String key= Arrays.toString(count);

           m.computeIfAbsent(key,k->new ArrayList<>()).add(str);

        }
        return new ArrayList<>(m.values());
    }
}
