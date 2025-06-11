class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--; // We already consider 1 as the first element

        while (k > 0) {
            long count = countPrefix(curr, n);
            if (k >= count) {
                k -= count;
                curr += 1; // move to next prefix
            } else {
                curr *= 10; // go deeper in current prefix
                k -= 1;     // subtract one for current node
            }
        }

        return curr;
        
    }
    private long countPrefix(long prefix, int n) {
        long count = 0;
        long curr = prefix;
        long next = prefix + 1;

        while (curr <= n) {
            count += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }

        return count;
    }

}
