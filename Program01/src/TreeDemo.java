import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Author: Norhan Abbas
 * Date: 18th 0f May, 2019
 *
 * Overview: This program
 *           1- reads a line of numbers separated by comma and space from a file
 *           2- builds a Binary Search Tree (BST) from the given numbers
 *
 *           3- then, prompts the user to insert, search, or delete any value entered by the user
 *           4- Additionally, the user is able to print them Inorder, Preorder, or Postorder
 *
 * NOTE THAT big commented blocks of code are just some logical FAILURES
 *
 */

public class TreeDemo {

    public static void main(String[] args) {
        String numstr;
        ArrayList<Integer> numberList = new ArrayList<>();
        BinarySearchTree t = new BinarySearchTree();
        String userChoice = "";

        // TODO: Read from a file

        try {
            // Use Scanner object to read from my file
            Scanner fileInput = new Scanner(new File("BST.txt"));
            while (fileInput.hasNext()) // check for next string
            {
                // save the next string into the following variable
                numstr = fileInput.next();


                // TODO: Handle the unwanted characters
                String noCommas = numstr.replace(",", "");
                Integer number = Integer.valueOf(noCommas);
                //System.out.println(number);


                // add the new integer to the list
                numberList.add(number);
            }

            fileInput.close();

            }

        catch (FileNotFoundException exc) {
        System.out.println("IDIOT, you screwed up (•̀o•́)ง");
        System.out.println("In other words, there was a problem opening the input file");
        }


        // TODO: Insert
        for (int each_number: numberList) {
            t.insertGo(each_number);
        }
//*************************************************************************
 /*       System.out.println("PrintTree\n");
        t.printTreeGo();
        System.out.println("\n");

       // public void printTree1(t.root) {
            if (t.root == null) {
                return;
            }

            print(t.root.left);
            StdOut.println(t.root.key);
            printTree1(t.root.right);
        //}*/
//*************************************************************************

        // TODO: prompts the user to pick until s/he quits
        do {

            System.out.println("I -Insert");
            System.out.println("F -Find");
            System.out.println("D -Delete\n");

            System.out.println("IO -InOrder");
            System.out.println("PRO -PreOrder");
            System.out.println("PSO -PostOrder");

            System.out.println("Q -Quit");
            System.out.print("What is your choice? ");
            //System.out.println(t.root);


            // convert the user input to upper case,
            // so that f is equivalent to F.. for lazy users :D
            Scanner input = new Scanner(System.in);
            userChoice = input.next().toUpperCase();


            switch (userChoice) {

                case "I":
                    System.out.println("Enter a value");
                    Scanner value0 = new Scanner(System.in);

                    while (!value0.hasNextInt()) {     // Robustness: ensure user enters an integer
                        value0.next();
                        System.out.println("Enter an INTEGER");
                    }

                    int v0 = value0.nextInt();
                    t.insertGo(v0);
                    System.out.println("NOW, the InOrder is");
                    t.inOrderGo();
                    System.out.println("\n\n");
                    break;


                case "F":
                    System.out.println("Enter a value");
                    Scanner value1 = new Scanner(System.in);

                    while (!value1.hasNextInt()) {     // Robustness: ensure user enters an integer
                        value1.next();
                        System.out.println("Enter an INTEGER");
                    }

                    int v1 = value1.nextInt();
                    System.out.println(t.isHereGo(v1)+"\n");
                    break;


                case "D":
                    System.out.println("Enter a value");
                    Scanner value2 = new Scanner(System.in);

                    while (!value2.hasNextInt()) {     // Robustness: ensure user enters an integer
                        value2.next();
                        System.out.println("Enter INTEGER");
                    }

                    int v2 = value2.nextInt();
                    t.deleteMinGo(v2);
                    System.out.println("NOW, the InOrder is");
                    t.inOrderGo();
                    System.out.println("\n\n");
                    break;


                case "IO":
                    t.inOrderGo();
                    System.out.println("\n");
                    break;


                case "PRO":
                    t.preOrderGo();
                    System.out.println("\n");
                    break;


                case "PSO":
                    t.postOrderGo();
                    System.out.println("\n");
                    break;


                case "Q":
                    System.exit(0);


                default:   // Robustness: for Smartie users :D
                    System.out.println("Invalid input, BUMMER");
                    System.out.println("\n");


            }
        } while (userChoice.equals("Q") == false);





    }


}