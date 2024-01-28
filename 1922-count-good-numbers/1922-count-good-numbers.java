class Solution {
    long mod = 1000000007;

    private long power(long base, long exponent) {
        if (exponent == 0) return 1;
        long ans = power(base, exponent / 2);
        ans = (ans * ans) % mod;
        if (exponent % 2 == 1) ans = (ans * base) % mod;
        return ans;
    }

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = n / 2 + n % 2;
        return (int) ((power(5, even) * power(4, odd)) % mod);
    }
}
