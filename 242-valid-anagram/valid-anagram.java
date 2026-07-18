class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap <Character,Integer> check = new HashMap<>();
        if (s.length()!= t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            check.put(c,check.getOrDefault(c,0) +1 );
            }
        for(int i = 0 ; i<t.length() ; i++){
            char a = t.charAt(i);
            check.put(a,check.getOrDefault(a,0) -1 );
        }
        for(int value : check.values()){
            if(value != 0 ){
                return false ;
            }
        }return true;
    }
    
}