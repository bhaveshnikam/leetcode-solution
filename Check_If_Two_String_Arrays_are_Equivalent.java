
class Strings {
    public static void main(String[] args) {
        String a[] = { "a", "cb" };
        String b[] = { "ac", "b" };
        System.out.println(ise(a, b));

    }

    public static boolean ise(String a[], String[] b) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            sb1.append(b[i]);
        }
        String s1 = sb.toString();
        String s2 = sb1.toString();
        return s1.equals(s2);
    }
}
