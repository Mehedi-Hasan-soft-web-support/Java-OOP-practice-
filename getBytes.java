public class GetBytes{
public static void main(String[] args) {
String str = "Farhan Rahman";
byte[] byteArray = str.getBytes();
System.out.println("Byte array:");
for (byte b : byteArray) {
System.out.print(b + " ");
}
}
}
