package org.example;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(3);

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Размер после добавлени 3 элементов: " + list.getSize());

        System.out.println("Получение первого элемента: " + list.get(0));

        // Проверка расширения
        list.add("D");
        System.out.println("Размер после добавлени четвертого элемента: " + list.getSize());


        // Добавление по индексу
        list.add(0, "E");
        System.out.println("Новый первый элемент: " + list.get(0));


        // Проверка удаления по индексу
        System.out.println("\nРазмер до удаления: " + list.getSize());
        list.remove(0);
        System.out.println("Размер после удаления: " + list.getSize());
        System.out.println("Первый элемент после удаления: " + list.get(0));

        // Проверка удаления по значению
        list.remove("A");
        System.out.println("\nРазмер после удаления " + list.getSize());

        // Проверка добавления элементов из другого массива
        Object[] newArray = {"А", "Б", "В"};
        list.addAll(newArray);
        System.out.println("\nРазмер после addAll: " + list.getSize());
        System.out.println("Массив после addAll: ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //Получение ошибки при попытке плучения несуществующего элемента
        try {
            list.get(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nИсключение: " + e);
        }

        try {
            list.add(10, "A");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
    }
}

