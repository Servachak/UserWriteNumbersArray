import java.util.Scanner;

/**
 * Created by adavi on 02.08.2017.
 */
public class BuildArray {

   static Scanner scanner  = new Scanner(System.in);
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
        boolean okNumber = false;
        int number = 0;

       while (!okNumber){

            System.out.println("Введіть число більше трьох");

             number = BuildArray.scanner.nextInt();

            if (number > 3){

                okNumber = true;

            }else{
                System.out.println("Число має бути більше трьох");

            }
        }
        return number;
        }

        public void evenNumbersArray(int arr[]){

        int [] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++){

            if (arr[i] % 2 == 0 && arr[i] != 0){
                newArray[i] = arr[i];
                System.out.print(newArray[i] + " ");
            }
        }

        }
}
