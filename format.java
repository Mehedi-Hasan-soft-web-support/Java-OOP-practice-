public class format {
public static void main(String[] args) {
String name = "Mehedi";
int age = 22;
double score = 92.5;
// Using format() method
String formattedString = String.format("Name: %s, Age: %d, Score: %.2f", name, age, score);
// Printing the formatted string
System.out.println(formattedString);
}
}