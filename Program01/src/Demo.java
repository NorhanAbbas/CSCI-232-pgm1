import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int numbers;
        ArrayList<Integer> numberList = new ArrayList<>();


        try {
            // Use Scanner object to read from my file
            Scanner fileInput = new Scanner(new File("BST2.txt"));
            while (fileInput.hasNextInt()) // check for next string
            {
                // save the next string into the following variable
                numbers = fileInput.nextInt();

                // if you're gonna uncomment the next print statement, COMMENT THE LAST FOR LOOP
                // .... works the same
                //  System.out.println(words);


                // TODO: Handle the unwanted characters


                //String noCommas = words.replace(",", "");
                //Integer number = Integer.valueOf(noCommas);
                  System.out.println(numbers);


                // add the new string to the list
                numberList.add(numbers);
            }
            fileInput.close();

        }

        catch (FileNotFoundException exc) {
            System.out.println("IDIOT, you screwed up (•̀o•́)ง");
            System.out.println("In other words, there was a problem opening the input file");
        }
        // print the list of numbers we have
       // for (int each_number: numberList) {
         //   System.out.println(each_number);
        //}
    }


}
