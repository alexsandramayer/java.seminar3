package seminar3;
import java.util.ArrayList;
import java.util.Random;


// Задача 1. Пусть дан произвольный список целых чисел, удалить из него четные числа


// public class sem3 {
//     public static void main(String[] args){
//         ArrayList<Integer> list1 = new ArrayList<>();   
//         Random rand = new Random();                     

//         for (int i = 0; i < 10; i++) {  
//             list1.add(i, rand.nextInt(99));
//         }
//         System.out.println("Исходный массив: " + list1);
//         for (int i = 0; i < list1.size(); i++){
//             if (list1.get(i) % 2 == 0) 
//             {
//                 list1.remove(i);
//                 i--;
//             }
//         }

//         System.out.println("Массив нечетных чисел: " + list1 + "\n");
//     }
// }


// Задача 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
// public class sem3 {
//     public static void main(String[] args){
//         ArrayList<Integer> list2 = new ArrayList<>();   
//         Random rand = new Random();                    

//         for (int i = 0; i < 10; i++) 
//         {  
//             list2.add(i, rand.nextInt(99));
//         }
//         System.out.println("Дан массив: " + list2 + "\n");
//         int min = list2.get(0);
//         int max = list2.get(0);
//         int sum = 0;

//         for (int i = 0; i < list2.size(); i++)
//         {
//             max = max < list2.get(i) ? list2.get(i) : max; 
//             min = min > list2.get(i) ? list2.get(i) : min; 
//             sum += list2.get(i);
//         }

//         System.out.println("Максимальное число в массиве : " + max +
//                         "\nМинимальное число в массиве : " + min +
//                     "\nсреднее арифметическое в массиве : " + sum/list2.size() );

//     }
// }