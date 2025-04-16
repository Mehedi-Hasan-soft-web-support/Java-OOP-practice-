public class offsetByCodePoints {
public static void main(String[] args) {
String str = "Hello, ?!";
int newIndex = str.offsetByCodePoints(0, 3);
System.out.println("New index: " + newIndex);
}
}