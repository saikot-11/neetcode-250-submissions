class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int countOfBoats = 0;

        Arrays.sort(people);

        while (left <= right) {
            int totalWeight = people[left] + people[right];

            if (totalWeight <= limit) {
                left++;
                right--;
                countOfBoats++;
            } else {
                right--;
                countOfBoats++;
            }
        }

        return countOfBoats;
    }
}