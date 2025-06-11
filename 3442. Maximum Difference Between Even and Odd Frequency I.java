class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch =s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int maxOdd= Integer.MIN_VALUE;
        int midEven=Integer.MAX_VALUE;

        for (int i : mp.values()){
            if(i%2==0){
                midEven=Math.min(midEven,i);
            }
            else{
                maxOdd=Math.max(maxOdd,i);
            }
        }
        return maxOdd-midEven;
        
    }
}
