public class getChars {
public static void main(String[] args) {
String str = "Hey, Mehedi!";
char[] charArray = new char[5];
str.getChars(7, 12, charArray, 0);
System.out.println(charArray);
}
}