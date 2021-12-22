public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int[][] array1 = {{1, 2, 3, 4, 5},
                {3, 4, 7, 8, 9}};

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        System.out.println(array1[1][2]);
        System.out.println(array1[1][0]);
        System.out.println(array1[0][3]);
        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }

        }

        }
    }










