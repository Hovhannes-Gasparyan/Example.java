package HomeWork;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 6, 3, 9, 15, 52, -3, 5, 8};


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("մասիվի առաջին էլեմենտը " + numbers[0]);
        System.out.println();

        System.out.println("մասիվի վերջին էլեմենտը " + numbers[numbers.length - 1]);
        System.out.println();

        System.out.println("մասիվի երկարությունը " + numbers.length);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        System.out.println();

        System.out.println("մասիվի ամենափոքր թիվը " + min);
        System.out.println();

        if (numbers.length <= 2) {
            System.out.println("can't print middle values");

        } else if (numbers.length % 2 == 0) {
            int mid1 = numbers.length / 2 - 1;
            int mid2 = numbers.length / 2;
            System.out.println("Մեջտեղի երկու էլեմենտները: " + numbers[mid1] + "և" + numbers[mid2]);
        } else {
            int mid = numbers.length / 2;
            System.out.println("Մեջտեղի թիվը: " + numbers[mid]);
        }
        System.out.println();
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println("Զույգերի քանակը: " + evenCount);
        System.out.println("Կենտերի քանակը: " + oddCount);
        System.out.println();

        int sum = 0;
        for (int num : numbers){
            sum+= num;
        }
        System.out.println("Էլեմենտների գումարը: " + sum);
        System.out.println();

        double average = (double) sum / numbers.length;
        System.out.println("Միջին թվաբանականը: " + average);
    }
}

