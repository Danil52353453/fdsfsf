
// import java.util.Stack;

// import java.util.LinkedList;
// import java.util.ListIterator;


//                            Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


// public class Homewor5 {
//     public static void main(String[] args) {
//         LinkedList<Integer> numbers = new LinkedList<Integer>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);

//     ListIterator<Integer> listIterator = numbers.listIterator();
//         while (listIterator.hasNext()) {
//             System.out.println(listIterator.next());
//         }
//         System.out.println();
//         while(listIterator.hasPrevious()){
//             System.out.println(listIterator.previous());
//         }
//     }
// }



// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.



// import java.util.LinkedList;

// public class Homewor5{
//     private static LinkedList<Integer> queue = new LinkedList<>();
//     public static void main(String[] args) {
//         for (int i = 1; i < 11; i++) {
//             enqueue(i);
//         }
//         System.out.println(queue);
//         System.out.println("Возвращает первый элемент из очереди и удаляет его : " + dequeue());
//         System.out.println("Возвращает первый элемент из очереди, не удаляя: " + first());
//         System.out.println(queue);
//     }
//     public static void enqueue(int value){
//         queue.addLast(value);
//     }
//     public static int dequeue(){
//         return queue.pollFirst();
//     }
    
//     public static int first() {
//         return queue.peekFirst();
//     }   
// }



// 3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

// Например:
// 5 4 3 - + => 5 1 + => 6


/**
 * Homewor5
 */
// import java.util.Stack;
// import java.util.Stack;

// public class Homewor5 {

//     private static boolean isDigit(String s) throws NumberFormatException {
//         try {
//             Integer.parseInt(s);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         var exp = "5 4 3 - + ".split(" "); 
//         int res = 0;
//         System.out.println(exp);
        
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < exp.length; i++) {

//             if (isDigit(exp[i])) {
//                 st.push(Integer.parseInt(exp[i]));
//             } else {
//                 switch (exp[i]) {
//                     case "+":
//                         res = st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "-":
//                         res = -st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "*":
//                         res = st.pop() * st.pop();
//                         st.push(res);
//                         break;
//                     case "/":
//                         res =  st.pop()/ st.pop();
//                         st.push(res);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.printf("%d\n", st.pop());
//     }
// }