package Demo;

public class Tri {

    public static void main(String[] args) {
        int rows = 5,j , k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - j) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

