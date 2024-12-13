class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum = 0;
        StringBuilder ans = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                sum = carry + (num1.charAt(i) - '0') + (num2.charAt(j) - '0');
                i--;
                j--;
            } else if (i >= 0) {
                sum = carry + (num1.charAt(i) - '0');
                i--;
            } else {
                sum = carry + (num2.charAt(j) - '0');
                j--;
            }

            ans.append((char)((sum % 10) + '0')); // Append the last digit of the sum
            carry = sum / 10; // Update carry
        }

        if (carry > 0) {
            ans.append('1'); // Append the remaining carry, if any
        }

        return ans.reverse().toString(); // Reverse the result to get the correct order
    }
}
