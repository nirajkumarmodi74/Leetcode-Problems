class Solution {
    public char kthCharacter(int k) {
        // ek pattern aa rhi hai bit mein like k-1 mein jitne bit hai utne se 'a' ko badha do
        int shift = Integer.bitCount(k-1);
        return (char)('a'+shift);
    }
}