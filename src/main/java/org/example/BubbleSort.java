package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        Object[] array = {8, 5, 6, 10, 3, 1};
        list.addAll(array);
        list.bubbleSort();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("_______________________________________");

        //отсортированный список, ожидаем 1 проход
        CustomArrayList list2 = new CustomArrayList();
        Object[] array2 = {1, 2, 3, 4, 5, 6};
        list2.addAll(array2);
        list2.bubbleSort();
        for (int i = 0; i < list2.getSize(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("_______________________________________");
        //требуется 1 перестановка, ожидаем 2 прохода
        CustomArrayList list3 = new CustomArrayList();
        Object[] array3 = {1, 0, 3, 4, 5, 6};
        list3.addAll(array3);
        list3.bubbleSort();
        for (int i = 0; i < list3.getSize(); i++) {
            System.out.println(list3.get(i));
        }


    }

}
