class hackerrank {
    public static void main(String[] args) {
        String s1 = "bhavesh";
        String s2 = "hsevab";
        // String s3 = s1 + s2;
        // System.out.println(s3);
        System.out.println(copystring(s1, s2));
    }

    public static boolean copystring(String s1, String s2) {
        String s3 = s1 + s2;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) != s3.charAt(s3.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
