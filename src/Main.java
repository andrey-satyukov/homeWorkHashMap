import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//        Код должен работать с любой последовательностью и объемом списка чисел.
//        В качестве отладочной информации можете использовать список чисел
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("Task 2");
//        Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//        Код должен работать с любой последовательностью и объемом списка чисел.
//        В качестве отладочной информации можете использовать список чисел
        Collections.sort(nums);
        System.out.println(nums);
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Task 3");
//        Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
        List<String> words = new ArrayList<>(List.of("aaa", "bbb", "aaa", "ccc"));
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);
        System.out.println("Task 4");
//        Напишите код, который выводит в консоль все количество дублей из списка слов.
//        *Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
//        В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
        List<String> words4 = new ArrayList<>(List.of("aaa", "bbb", "aaa","aaa", "ddd" , "ccc", "ccc", "aaa", "aaa"));
        Map<String, Integer> numberOfDuplicate = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for (String word:
             words4) {
            if (numberOfDuplicate.containsKey(word)) {
                numberOfDuplicate.put(word, numberOfDuplicate.get(word)+1);
            } else {
                numberOfDuplicate.put(word, 1);
            }
        }
        for (String word : numberOfDuplicate.keySet()) {
            if (numberOfDuplicate.get(word) > 1) {
                duplicates.add(numberOfDuplicate.get(word));
            }
        }
        System.out.println(duplicates);
    }

}