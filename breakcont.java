public class breakcont{
    public static void main(String[] args) {
        System.out.println("Using break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // loop stops when i == 3
            }
            System.out.println(i);
        }

        System.out.println("\nUsing continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips the rest of the loop body when i == 3
            }
            System.out.println(i);
        }
    }
}
