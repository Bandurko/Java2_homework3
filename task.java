// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.*;

public class task {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.clear();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(101));
        }

        System.out.println(list);
        ArrayList<Integer> list2 = getOdd(list);
        System.out.println(list2);
        System.out.println(getMin(list2));
        System.out.println(getMax(list2));
        String result = String.format("%.3f", getArMean(list2));
        System.out.println(result);

    }
    public static ArrayList<Integer> getOdd(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
       while (iterator.hasNext()){
           if (iterator.next() % 2 == 0){
            iterator.remove();
           }
       }
       return list;
    }

    public static Integer getMin(ArrayList<Integer> list) {
        Integer min = list.get(0);
       for (int i = 1; i < list.size(); i++){
        if (list.get(i) < min){
            min = list.get(i);
        }
       }
       return min;
    }
    
    public static Integer getMax(ArrayList<Integer> list) {
        Integer max = list.get(0);
       for (int i = 1; i < list.size(); i++){
        if (list.get(i) > max){
            max = list.get(i);
        }
       }
       return max;
    }

    public static Double getArMean(ArrayList<Integer> list) {
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        double mean = sum / list.size();
        return mean;
    }

}
