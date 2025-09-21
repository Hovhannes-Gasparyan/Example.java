package HomeWork;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 6, 8, 6, 9, 1, 5, 0, 3};
        int n = 6;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                count++;

            }
            System.out.println("Մասիվում " + n + " թիվը կա " + count);

        }
        ;
        int[] numbers = new int[]{1, 5, 6, 8, 6, 9, 1, 5, 0, 3};
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

            i++;
            j--;


        }
        System.out.println(java.util.Arrays.toString(numbers));
        int[] numb = new int[]{1, 5, 6, 8, 6, 9, 1, 5, 0, 3};
        boolean[] visited = new boolean[numb.length];
        int dublicates = 0;
        for (i = 0; i < numb.length; i++) {
            if (!visited[i]) {
                int countOccurrences = 1;
                for (j = i + 1; j < numb.length; j++) {
                    if (numb[i] == numb[j]) {
                        countOccurrences++;
                        visited[j] = true;
                    }

                }
                if (countOccurrences > 1) {
                    dublicates++;
                }

            }

        }
        System.out.println(dublicates);
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'է', 'ի', 'ո', 'օ','և'};
        count = 0;
        for (i = 0; i < ; i++) {

        }

    }


}
