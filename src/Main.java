import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {2, 1, 3, 4, 1, 2};
        Set<Integer> resInt = getUniqueElements(numbers1);
        System.out.println(resInt);
        System.out.println();


        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        Set<String> resString = getUniqueElements(words);
        System.out.println(resString);
        System.out.println();


        int[] numbers2 = {4, 7, 9, 10, 11};
        int target = 7;
        int[] resIntArr = findNearestElements(numbers2, target);
        System.out.println(Arrays.toString(resIntArr));

    }

    /**
     * Метод находит уникальные(повторяющиеся) элементы массива типа int.
     *
     * @param arr В качестве параметра принимает массив типа int.
     * @return Возвращает коллекцию с уникальными числами.
     */
    public static Set<Integer> getUniqueElements(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (Integer el : arr) {
            nums.add(el);
        }
        return nums;
    }

    /**
     * Метод находит уникальные(повторяющиеся) элементы массива типа String.
     *
     * @param arr В качестве параметра принимает массив типа String.
     * @return Возвращает коллекцию с уникальными словами.
     */
    public static Set<String> getUniqueElements(String[] arr) {
        Set<String> words = new LinkedHashSet<>();
        for (String el : arr) {
            words.add(el);
        }
        return words;
    }

    /**
     * Метод ищет ближайшие числа от заданного числа.
     *
     * @param arr    В качестве параметра принимает массив типа int.
     * @param target В качестве параметра принимает искомое число int.
     * @return Возвращает массив int с ближайшими числами от заданного.
     */
    public static int[] findNearestElements(int[] arr, int target) {
        TreeSet<Integer> nums = new TreeSet<>();
        for (Integer el : arr) {
            nums.add(el);
        }
        return new int[]{nums.lower(target), nums.higher(target)};
    }

}