/**
 * Created by adavi on 02.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        BuildArray array = new BuildArray();



        int number = array.auditNamber();

        int[] myArray = array.arrayBuild(number);

        array.evenNumbersArray(myArray);

    }
}
