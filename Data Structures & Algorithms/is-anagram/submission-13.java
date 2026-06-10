class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> seen =  new HashMap<>();

        char[] splitter1 = s.toCharArray();
        char[] splitter2 = t.toCharArray();

        if(splitter1.length != splitter2.length) {
            return false;
        }

        for(int i = 0; i < splitter1.length; i++) {

            if(seen.containsKey(splitter1[i])) {
                int currentCount = seen.get(splitter1[i]);
                ++currentCount;
                seen.put(splitter1[i], currentCount);
            }
            else {
                seen.put(splitter1[i], 1);
            }
        }

        for(int k = 0; k < splitter2.length; k++) {
           
            if(!seen.containsKey(splitter2[k])) {
                return false;
            }
            else {
                int prevCount = seen.get(splitter2[k]);
                int currentCount = --prevCount;
                seen.put(splitter2[k], currentCount);

                if(currentCount < 0){
                    return false;
                }
            }
        }

        return true;

    }
}
