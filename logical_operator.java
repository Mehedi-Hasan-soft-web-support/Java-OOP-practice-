public class logical_operator {
public static void main(String[] args) {
boolean a = true;
boolean b = false;
System.out.println("a = " + a + ", b = " + b);
System.out.println("a && b: " + (a && b)); // false (both must be true)
System.out.println("a || b: " + (a || b)); // true (at least one is true)
System.out.println("!a: " + (!a)); // false (negation of true)
System.out.println("!b: " + (!b)); // true (negation of false)
int x = 10, y = 20;
System.out.println("x = " + x + ", y = " + y);
System.out.println("(x > 5 && y < 30): " + (x > 5 && y < 30)); // true
System.out.println("(x > 15 || y < 25): " + (x > 15 || y < 25));
}
}