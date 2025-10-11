package Example;

public class Stack2 {
    private int[] stack2; // сам массив
    private int tos;      // индекс вершины стека

    // ✅ Правильный конструктор
    Stack2(int size) {
        stack2 = new int[size];
        tos = -1;
    }

    // Помещает элемент в стек
    void push(int item) {
        if (tos == stack2.length - 1) {
            System.out.println("Стек заполнен.");
        } else {
            stack2[++tos] = item;
        }
    }

    // Извлекает элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stack2[tos--];
        }
    }
}
