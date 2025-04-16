public class matches {
public static void main(String[] args) {
String str = "mmmmmmmmmmmmm";
boolean result = str.matches("[a-zA-Z]+\\d+");
System.out.println(result);
}
}
