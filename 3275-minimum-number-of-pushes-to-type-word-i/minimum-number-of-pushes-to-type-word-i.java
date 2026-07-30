class Solution {
    public int minimumPushes(String word) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Integer> freqList = new ArrayList<>(map.values());
        Collections.sort(freqList);
        Collections.reverse(freqList);

        int totalpushes= 0 ; 
        int presscount = 0 ; 
        for (int i = 0 ; i < freqList.size();i++){
            presscount = (i/8)+1;
            totalpushes += freqList.get(i)*presscount; 
        }
        return totalpushes;
    }
}