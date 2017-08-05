import java.util.Scanner;

/**
 * Created by adavi on 02.08.2017.
 */
public class BuildArray {

   static Scanner scanner  = new Scanner(System.in);

/** number число яке вказує на довжине масиву та вибірку **/

    public int[] arrayBuild(int number){

        int [] arr = new int[number];

        for (int i = 0; i < arr.length; i++){

            arr[i] = (int)(Math.random() * (number));

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public int auditNamber(){
        /** okNumber - змінна для перевірки істиності умови **/
        boolean okNumber = false;

        /** number  - число введене від користувача**/
        int number = 0;

       while (!okNumber){

            System.out.println("Введіть число більше трьох");

            /** користувач вводить число **/
             number = BuildArray.scanner.nextInt();

             /** якщо число введене користувачем більше 3 то виконуються умова**/
            if (number > 3){

                okNumber = true;

                /** якщо ні то виводиться повідомлення **/
            }else{
                System.out.println("Число має бути більше трьох");

            }
        }
        return number;
        }

        /** arr[] - вхідний масив**/
        public void evenNumbersArray(int arr[]){

        /** створюється новий масив який дорівнює довжині вхідного масиву **/
        int [] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++){

            /** пробігаючись по вхідному масиву перевіряємо чи елемент масиву при діленні по модулю на 2 ріввний 0(тобто чи парний)
            * якщо так то зберігаємо це значення в новий масив **/
            if (arr[i] % 2 == 0 && arr[i] != 0){
                newArray[i] = arr[i];
                System.out.print(newArray[i] + " ");
            }
        }

        }
}
