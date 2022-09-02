package Task2;

/**
 * Задача отсортировать массив {5,6,3,2,5,1,4,9}. Выполнена с помощью алгоритма слияния (MergeSort).
 * Также написан тест, который находится в другом классе (не получилось junit внедрить в основной).
 * @author Albina Safina
 */

public class Main {

    public static void main(String[] args) {
        int arr[] = {5,6,3,2,5,1,4,9};

        mergeSort(arr, arr.length);
        for (int s: arr){
            System.out.print(s + " ");
        }

    }

    /**
     * Реккурсивный метод, который разбивает текущий массив на два подмассива.
     * Как только масссив разбит на единичные массивы, метод их возвращает.
     *
     * @param a текущий массив
     * @param n размер массива
     */
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    /**
     * Функция слияния сравнивает элементы каждого подмассива друг с другом и помещает наименьший во входной массив a[].
     * При достижении конца одного из массивов копируется оставшаяся часть другого массива в a[].
     *
     * @param a входной массив. который будет отсортирован
     * @param l левый подмассив
     * @param r правый подмассив
     * @param left конец левого массива
     * @param right начало правого массива
     */
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}