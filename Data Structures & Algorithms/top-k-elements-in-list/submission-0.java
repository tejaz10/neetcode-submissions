class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
                map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue()); // to sort iin descending order 5 - 3 == positive so 5 comes first and then 3

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}
