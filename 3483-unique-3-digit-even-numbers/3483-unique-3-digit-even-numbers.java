class Solution {
    public int totalNumbers(int[] digits) {
        int[] availableFreq = new int[10];
        for (int digit : digits) {
            availableFreq[digit]++;
        }
        int count = 0;
        for (int num = 100; num <= 998; num += 2) {
            int hundred = num / 100;
            int ten = (num / 10) % 10;
            int unit = num % 10;
            int[] neededFreq = new int[10];
            neededFreq[hundred]++;
            neededFreq[ten]++;
            neededFreq[unit]++;
            boolean canForm = true;
            for (int d = 0; d < 10; d++) {
                if (neededFreq[d] > availableFreq[d]) {
                    canForm = false;
                    break;
                }
            }
            if (canForm) {
                count++;
            }
        }
        return count;
    }
}