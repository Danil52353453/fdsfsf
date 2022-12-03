import java.lang.reflect.Array;
import java.util.Arrays;

//                     Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.


// import java.util.Random;
// public class Java {
//         public static void main(String[] args) {
//             int[] array = new int[10];
//                 Random rnd = new Random();

//                 for(int i = 0; i <array.length; i++)
//                 {
//                     array[i] = rnd.nextInt(101);
//                     System.out.print(array[i] + " ");
//                 }
//                 int min = array[0];
//                 for(int i = 0; i < array.length;i++) {
//                     if(min > array[i]) {
//                         min=array[i];
//                     }
//                 }
//                 System.out.println();
//                 System.out.println("Минимальное число " + min);

//                 int max = array[0];
//                 for(int i = 0; i < array.length;i++) {
//                     if(max < array[i]) {
//                         max=array[i];
//                     }
//                 }
//             System.out.println("Максимальное число " + max);

//                 int averege = array[0];
//                 for(int i = 0 ; i < array.length; i++ ){
//                     averege += array[i]/array.length;
//                 }
//                 System.out.println("Среднее число " + averege);
//             }
//         }

//                  Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
// import java.util.Arrays;
// import java.util.List;
// import java.util.Map;

// import static java.util.stream.Collectors.*;

//  class Ideone {
//     public static void main(String[] args) {
//         System.out.println(get(Arrays.asList(1,2,3,4,5)));    // [2, 4]
//         System.out.println(get(Arrays.asList(1,2,3,4,5,-1))); // [1, 3, 5, -1]
//     }

//     static List<Integer> get(List<Integer> integers){
//         Map<Boolean, List<Integer>> map = integers.stream()
//              .collect(partitioningBy(x -> x % 2 == 0, toList()));
//         return map.get(map.get(false).size() % 2 != 0);
//     }
// }
//                                Реализовать алгоритм сортировки слиянием.

// public class Java {
//             public static void main(String[] args){
//                 int[] arr = {4,56,34,12,32};
//                 mergeSoft(arr);
//                 for (int i = 0; i < arr.length; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
//             private static void mergeSoft(int[] arr) {
//                 int n = arr.length;
//                 if (n ==1) return;

//                 int mid = n/2;
//                 int[] l = new int[mid];
//                 int[] r = new int [n-mid];

//                 for(int i = 0; i < mid; i++){
//                     l[i] =arr[i];
//                 }
//                 for (int i =mid; i < n; i++) {
//                     r[i-mid] = arr[i];
//                 }

//                 mergeSoft(l);
//                 mergeSoft(r);
//                 merge(arr,l,r);


//             }
//             private static void merge(int[] arr, int[] l, int[] r) {
//                 int left = l.length;
//                 int right = r.length;
//                 int i =0;
//                 int j = 0;
//                 int ind = 0;

//                 while (i < left && j <right ) {
//                     if (l[i] < r[j]) {
//                         arr[ind] = l[i];
//                         i++;
//                         ind ++ ;
//                     }
//                     else{
//                         arr[ind] = r[j];
//                         j++;
//                         ind++;

//                     }
//                 }
//                 for(int ll = i ; ll < left; ll++){
//                     arr[ind++] = l[ll];
//                 }
//                 for (int rr = j; rr < right; rr++) {
//                     arr[ind++] = r[rr];
//                 }
//             }
// }

// Мой вопрос , вот есть встроенный метод Arrays.sort , она каким способов перебирает массив? И в практическом смысле , ее всегда исрользуют ? или в зависимости от ситуации ?

public class Java {
            public static void main(String[] args){
                int[] array = {54,31,65,12,4,-3};
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
            
            }
}
