/* NAMA : Santi
Nim : 13020210162 */
public class TestErr20162 {
    public static void main(String[] args) {
        int tot = 1;
        int j = 2;
        for (int i = 1; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10);
        while (j < 10) {
            j++;
        }
    }
}
