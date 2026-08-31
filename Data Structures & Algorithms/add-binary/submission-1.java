class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        boolean isCarry = false;

        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (isCarry) {
                    sb.append('1');
                    isCarry = true;
                } else {
                    sb.append('0');
                    isCarry = true;
                }
            } else if (a.charAt(i) == '1' || b.charAt(j) == '1') {
                if (isCarry) {
                    sb.append('0');
                    isCarry = true;
                } else {
                    sb.append('1');
                    isCarry = false;
                }
            } else {
                if (isCarry) {
                    sb.append('1');
                    isCarry = false;
                } else {
                    sb.append('0');
                    isCarry = false;
                }
            }

            i--;
            j--;
        }

        while (i >= 0) {
            if (isCarry) {
                if (a.charAt(i) == '1') {
                    sb.append('0');
                    isCarry = true;
                } else {
                    sb.append('1');
                    isCarry = false;
                }
            } else {
                sb.append(a.charAt(i));
            }
            i--;
        }

        while(j >= 0) {
            if (isCarry) {
                if (b.charAt(j) == '1') {
                    sb.append('0');
                    isCarry = true;
                } else {
                    sb.append('1');
                    isCarry = false;
                }
            } else {
                sb.append(b.charAt(j));
            }
            j--;
        }

        if (isCarry) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}