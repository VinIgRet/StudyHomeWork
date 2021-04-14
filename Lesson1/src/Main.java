import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        k++;
        int znk = 1;
        long kfn = 1;
        long pos = 0;
        while (pos + 9 * kfn * znk < k) {
            pos += 9 * kfn * znk;
            kfn *= 10;
            znk++;
        }
        long val = (k - pos) / znk + kfn - 1;
        int ost = (int) ((k - pos) % znk);
        if (ost > 0) {
            val ++;
            while (znk > ost) {
                val /= 10;
                znk--;
            }
        }
        System.out.println(val % 10);
    }
}
