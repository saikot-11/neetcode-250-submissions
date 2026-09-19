class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stck = new Stack<>();
        int [] res = new int[arr.length];
        res[arr.length - 1] = -1;
        stck.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >=0; i--) {
            res[i] = stck.peek();
            if (arr[i] > stck.peek()) {
                stck.push(arr[i]);
            }
        }

        return res;
    }
}