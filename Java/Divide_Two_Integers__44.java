//QUESTION-->
//Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

// The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

// Return the quotient after dividing dividend by divisor.

// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 

// Example 1:

// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.
// Example 2:

// Input: dividend = 7, divisor = -3
// Output: -2
// Explanation: 7/-3 = -2.33333.. which is truncated to -2.

//ANSWER-->


//  My Anwer-->
class Solution {
    public static int divide(int dividend, int divisor) {
        // Edge case: Divisor is 0
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        
        // Edge case: Overflow condition
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow
        }

        int sum = 0, count = 0;
        boolean negative = (dividend < 0) ^ (divisor < 0); // Determine if the result should be negative

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (sum + divisor <= dividend) {
            sum += divisor;
            count++;
        }

        return negative ? -count : count;
    }
}


// Actual Answer-->
class Solution {
    public:
        int divide(int dividend, int divisor) {
            // Handle the case where dividend is equal to divisor
            if (dividend == divisor) return 1;
    
            unsigned int ans = 0;
            int sign = 1;
    
            // Determine the sign of the result
            if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
                sign = -1;
    
            // Convert both dividend and divisor to positive integers
            unsigned int n = abs(dividend), d = abs(divisor);
    
            // Perform the division
            while (n >= d) {
                int count = 0;
                while (n > (d << (count + 1)))
                    count++;
                n -= d << count;
                ans += 1 << count;
            }
    
            // Handle overflow case
            if (ans == (1 << 31) && sign == 1) return INT_MAX;
    
            return sign * ans;
        }
    };