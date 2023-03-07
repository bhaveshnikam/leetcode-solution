class Solution {
    public String[] sortPeople(String[] sen, int[] height) {
    // String[] s = new String[names.length];
        // int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length - 1-i ; j++) {
                if (height[j] < height[j + 1]) {
                   int temp = height[j];
                    String m = sen[j];
                    height[j] = height[j + 1];
                    sen[j] = sen[j + 1];
                    height[j + 1] = temp;
                    sen[j + 1] = m;
                }
            }
        }
        // for (int i = 0; i < height.length; i++) {
        //     System.out.print(s[i] + " ");
        // }
        return sen;
    }
}
