class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int sum = digits[digits.length - 1] + 1;
        int carry = sum / 10;
        list.add(sum % 10);

        for (int i = digits.length - 2; i >= 0; i--) {
            sum = digits[i] + carry;
            carry = sum / 10;
            list.add(sum % 10);
        }

        if (carry > 0) {
            list.add(carry);
        }

        int [] res = new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[list.size() - i - 1] = list.get(i);
        }

        return res;
    }
}
