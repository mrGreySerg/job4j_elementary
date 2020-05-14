package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Данный элемент в массиве отсутствует !!!");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3"};
        try {
            System.out.println(indexOf(array, "4"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
