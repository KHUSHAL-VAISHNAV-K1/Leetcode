class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0 ; i < strs.length;i++){
        
        String s = strs[i];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        
        

        if(map.containsKey(key)){
            List<String> group = map.get(key);
            group.add(s);
        }
        else { 
            List<String> group = new ArrayList<>();
            group.add(s);
            map.put(key,group);

        }
    }return new ArrayList<>(map.values());

}
}