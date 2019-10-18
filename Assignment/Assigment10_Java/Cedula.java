public class Cedula {
    public static void main(String[] args) {
        int y = 1;
        int total = 0;
        int cedula = 17562176;
        int x;
        int z;
        while (cedula > 0) {
            x = cedula % 10;
            if (y == 1) {
                x = x * 2;
                y = y + 1;

            } else {
                x = x * 1;
                y = 1;

            }
            if (x >= 10) {
                z = x;
                z = x % 10;
                x = x / 10;
                x = z + x;
                total = total + x;

                cedula = cedula / 10;
                total = total % 10;
                System.out.println(total);
            }

        }

    }
}
