class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> li = new ArrayList<>();

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(arr[i], maxValue);
            minValue = Math.min(arr[i], minValue);
        }

        li.add(minValue);
        li.add(maxValue);

        return li;
    }
}