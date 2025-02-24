package org.example;

public class CustomArrayList {
    private Object[] array;
    private int capacity = 10;
    private int size = 0;

    public CustomArrayList() {
        array = new Object[capacity];
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    private void checkCapacity() {
        if (size == capacity) {
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void add(Object el) {
        checkCapacity();
        array[size++] = el;
    }

    public void add(int index, Object el) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        checkCapacity();

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = el;
        size++;
    }

    public Object get(int n) {
        if (n < size && n >= 0)
            return array[n];
        else throw new ArrayIndexOutOfBoundsException();
    }


    public void remove(int n) {
        if (n < size && n >= 0) {
            for (int i = n; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        } else throw new ArrayIndexOutOfBoundsException();
    }

    public void remove(Object el) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(el)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public void addAll(Object[] anotherArray) {
        if (size + anotherArray.length > capacity) {
            capacity += anotherArray.length;

            Object[] newArray = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        for (int i = size, j = 0; j < anotherArray.length; i++, j++) {
            array[i] = anotherArray[j];
        }
        size += anotherArray.length;
    }

    public int getSize() {
        return size;
    }
}

