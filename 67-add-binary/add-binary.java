class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int i = 0;
        int carry = 0;
        StringBuilder sum = new StringBuilder(); 

        while (i < len1 || i < len2 || carry != 0) {
            int x = 0;
            if (i < len1 && a.charAt(len1 - i - 1) == '1') {
                x = 1;
            }
            int y = 0;
            if (i < len2 && b.charAt(len2 - i - 1) == '1') {
                y = 1;
            }

            sum.insert(0, (x + y + carry) % 2); 
            carry = (x + y + carry) / 2;
            i += 1;
        }

        return sum.toString();
    }
}
