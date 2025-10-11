package HomeWork;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            dynamicArray.add(i * 2);
        }
        System.out.println("Մասիվի բովանդակությունը");
        dynamicArray.print();
        System.out.println();

        System.out.println("getByIndex(5) ->" + dynamicArray.getByIndex(5));
        System.out.println("getByIndex(20) ->" + dynamicArray.getByIndex(20));
    }
}
