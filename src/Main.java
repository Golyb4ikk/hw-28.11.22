public class Main {
    public static void main(String[] args) {
        //zadacha 1 and zadacha 2 and zadacha 3

        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        System.out.println(arrays[0] + " " + arrays[1] + " " + arrays[2]);
        for (int y = 2; y >= 0; y--) {
            System.out.print(arrays[y] + " ");
        }
        System.out.println();
        double[] bananas = {1.57, 7.654, 9.986};
        System.out.println(bananas[0] + " " + bananas[1] + " " + bananas[2]);
        for (int p = 2; p >= 0; p--) {
            System.out.print(bananas[p] + " ");
        }
        System.out.println();
        short[] apples = new short[2];
        apples[0] = 1;
        apples[1] = 2;
        System.out.println(apples[0] + " " + apples[1]);
        for (int z = 1; z >= 0; z--) {
            System.out.print(apples[z] + " ");
        }
        System.out.println();
        //zadacha 4
        int[] arrayss = new int[3];
        int y = 1;
        for (int h = 0; h < arrayss.length; h++) {
            arrayss[h] = y;
            y++;
            if (arrayss[h] % 2 > 0) {
                arrayss[h] = arrayss[h] + 1;
            }
            System.out.print(arrayss[h] + " ");
        }
    }


}
