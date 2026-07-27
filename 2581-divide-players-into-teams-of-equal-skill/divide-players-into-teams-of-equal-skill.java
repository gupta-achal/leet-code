class Solution {
    public long dividePlayers(int[] skill) {

        int n = skill.length;
        int sum = Arrays.stream(skill).sum();

        if (sum % (n / 2) != 0) {
            return -1;
        }

        int target = sum / (n / 2);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : skill) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        long ans = 0;

        for (int x : skill) {

            if (map.get(x) == 0)
                continue;

            map.put(x, map.get(x) - 1);

            int need = target - x;

            if (map.getOrDefault(need, 0) == 0)
                return -1;

            map.put(need, map.get(need) - 1);

            ans += (long) x * need;
        }

        return ans;
    }
}