package HomeWork;

public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 1, 9, 4, 7, 3, 7, 8, 5, 2,};
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < minIndex; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
        System.out.println();

    }
}
