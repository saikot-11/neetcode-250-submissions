class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    total += 4;
                    i++;
                    continue;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    total += 9;
                    i++;
                    continue;
                } else {
                    total += 1;
                }
            }

            if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    total += 40;
                    i++;
                    continue;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    total += 90;
                    i++;
                    continue;
                } else {
                    total += 10;
                }
            }

            if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    total += 400;
                    i++;
                    continue;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    total += 900;
                    i++;
                    continue;
                } else {
                    total += 100;
                }
            }

            if (s.charAt(i) == 'V') {
                total += 5;
            }

            if (s.charAt(i) == 'L') {
                total += 50;
            }

            if (s.charAt(i) == 'D') {
                total += 500;
            }

            if (s.charAt(i) == 'M') {
                total += 1000;
            }
        }

        return total;
    }
}