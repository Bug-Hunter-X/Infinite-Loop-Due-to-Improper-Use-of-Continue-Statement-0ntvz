public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            if (x == 5) {
                continue; // Skip the rest of the loop body for x == 5
            }
            System.out.println(x);
            x++;
        }
    }
}