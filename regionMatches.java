public class regionMatches {
public static void main(String[] args) {
String str1 = "Hello, World!";
String str2 = "World";
boolean result = str1.regionMatches(7, str2, 0, 5);
System.out.println(result); // Output: true
}
}