public class Zigzag {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {

            if (i < j) {

                System.out.print(a[i] + ", " + a[j] + ", ");

            }
            if (i == j) {
                System.out.println(a[i]);
                break;
            }
            j--;
            i++;
        }

    }
}
