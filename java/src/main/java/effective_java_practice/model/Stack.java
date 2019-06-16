package effective_java_practice.model;

import java.util.Arrays;

public class Stack {
    private String[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    public Stack() {
        elements = new String[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(String e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public String pop() {
        if (size == 0)
            throw new IllegalArgumentException();

        return elements[--size];
    }

    public String popMemorySafe() {
        if (size == 0)
            throw new IllegalArgumentException();
        String item = elements[--size];
        elements[size] = null;
        return item;
    }

    public void printStack() {
        for(String string: elements){
            System.out.print(string + ", ");
        }
        System.out.println("");
    }

    public void printStackSize() {
        System.out.println(this.elements.length);
    }
    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
