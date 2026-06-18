// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()){
//             return false;
//         }
//         int count[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             count[s.charAt(i)-'a']++;
//             count[t.charAt(i)-'a']--;
//         }
//         for(int i:count){
//             if(i!=0){
//                 return false;
//             }
//         }
//         return true;
       
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();


       
    }
}

