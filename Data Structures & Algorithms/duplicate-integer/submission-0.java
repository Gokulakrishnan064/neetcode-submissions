class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer>m1=new HashMap<>();
        for(int i:nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            
            if (m1.get(i)>1)
                return true;
        }
        return false;
    }
}