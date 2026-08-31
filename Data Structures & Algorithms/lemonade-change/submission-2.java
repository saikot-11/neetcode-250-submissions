class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveBill = 0;
        int tenBill = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveBill++;
            }

            if (bills[i] == 10) {
                tenBill++;
                if (fiveBill >= 1) {
                    fiveBill--;
                } else {
                    return false;
                }
            }

            if (bills[i] == 20) {
                if (tenBill >= 1 && fiveBill >= 1) {
                    tenBill--;
                    fiveBill--;
                } else if (fiveBill >= 3) {
                    fiveBill -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}