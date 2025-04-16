public class copyValueOf {
public static void main(String[] args) {
char[] myStr1 = {'M', 'e', 'h', 'e', 'd'};
String myStr2 = "";
myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
System.out.println("Etai code er output: " + myStr2);
}
}