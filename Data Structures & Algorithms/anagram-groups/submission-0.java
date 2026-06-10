class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map  = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {

            ArrayList<String> values = new ArrayList<String>();
            
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)) {

                values.add(strs[i]);
                map.put(key, values);
            }
            else {
                map.get(key).add(strs[i]);
            }

        }

        return new ArrayList<>(map.values());
    }
}

