class my450 {
public static void main(String[] args) {
System.out.print(power(2, 5));
}

public static int power(int x, int n) {
if (n == 0) {
return 1;
}
return x * power(x, n - 1);
}
}

power in O(log n)
class my450 {
public static void main(String[] args) {
System.out.println(optimisedpower(2, 10));
}

public static int optimisedpower(int x, int n) {
if (n == 0) {
return 1;
}
int halfpower = optimisedpower(x, n / 2) * optimisedpower(x, n / 2);
if (n % 2 != 0) {
halfpower = x * halfpower;
}
return halfpower;
}
}

tiling problem

class my450 {
public static void main(String[] args) {
System.out.println(tiles(13));
}

public static int tiles(int n) {
if (n == 0 || n == 1) {
return 1;
}
// vertical arrangement
int f1 = tiles(n - 1);

// horixontal arrangement
int f2 = tiles(n - 2);
return f1 + f2;

}
}
