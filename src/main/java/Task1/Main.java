package Task1;

/**
 * Первое задание: создать двумерный массив, заполнив его случайными числами.
 * И найти в нем максимальное, минимальное и среднее значение.
 * @author Albina Safina
 */

public class Main {

    private final static int MULTIPLIER = 1103515245;
    private final static int INCREMENT = 98765;
    private final static int MODULUS = 1000;

    private static int SEED;

    public static void main(String[] args) {
        int size_x = 7, size_y = 7;

        CreateArray(size_x, size_y);
    }

    /**
     * Создание массива и нахождение min, max и среднего значений
     * @param size_x количество столбцов в массиве
     * @param size_y количество строк в массиве
     */

    public static void CreateArray(int size_x, int size_y){
        int[][] array = new int[size_y][size_x];
        SeedInit();

        int max = 0, min = 1000;
        double average = 0;

        for (int i = 0; i < size_y; i++){
            for (int j = 0; j < size_x; j++){
                array[i][j] = RandomInt();

                max = Math.max(max, array[i][j]);
                min = Math.min(min, array[i][j]);

                average += array[i][j];

                System.out.format("%4d ", array[i][j]);
            }
            System.out.println();
        }

        average = average / (size_x * size_y);

        System.out.format("\nmax = %d, min = %d, average = %f", max, min, average);

    }

    public static int SeedInit(){
        SEED = (int) System.currentTimeMillis();
        return SEED;
    }


    public static int RandomInt(){
        SEED = (SEED * MULTIPLIER + INCREMENT) % MODULUS;

        if (SEED < 0){
            SEED *= -1;
        }

        return SEED;
    }

}