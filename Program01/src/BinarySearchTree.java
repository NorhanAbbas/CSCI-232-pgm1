import java.lang.String;
import java.util.Arrays;

/**
 * Author: Norhan Abbas
 * Date: 18th of May, 2019
 *
 * Overview:
 * these coding blocks build the foundation for the main functions used in my TreeDemo class
 *
 * NOTE THAT big commented blocks of code are just some logical FAILURES
 *
 */

public class BinarySearchTree {

    class Node {
        //int value;
        int key;
        Node left, right;

        public Node(int value) {
            key = value;
            left = right = null;
        }
    }

    // declare the root as a Node type
    Node root;


    // there is a built-in constructor in java anyway

/*    //constructor
    BinarySearchTree() {
       root = null;
    }*/


    // TODO: isEmpty function
    public boolean isEmpty(Node node) {
        if (node == null) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Insert method
    // if the root of the subtree, which we want to add a key to, is empty
    // create a new node with the given key

    // if it is NOT empty
    // get the keys smaller than the root on the LEFT
    // get the keys greater than the root on the RIGHT

    public Node insert(Node targetRoot, int key) {

        if (isEmpty(targetRoot) == true) {
            targetRoot = new Node(key);
            return targetRoot;
        }

        if (key < targetRoot.key) {
            targetRoot.left = insert(targetRoot.left, key);

        } else if (key > targetRoot.key) {
            targetRoot.right = insert(targetRoot.right, key);
        }

        return targetRoot;
    }

    // just initializing the insert method to have the root of the BST
    public void insertGo(int key) {
        root = insert(root, key);
    }

    // TODO: method for printing the tree
    public String repeat(String word, int n) {

        StringBuilder draw = new StringBuilder(word.length() * n);
        for (int i = 0; i < n; i++) {
            draw.append(word);
        }

        return draw.toString();

    }
//*************************************************************************
    /*
    for (int i = 0; i < 100; i++) {
        draw.append(" ");
    }*/

/*    int n = 0;

    public void printTree(Node node) {

*//*        if (node.key == root.key){
            System.out.println(root.key + repeat(" ", n));
        }*//*
            // no children at all
           if (isEmpty(node.left) && isEmpty(node.right)) {
               System.out.println(node.key + repeat(" ", 3));
               System.out.println("Here 0");
           }
            // right child only
           else if (isEmpty(node.left) && !isEmpty(node.right)) {
               System.out.println(node.left.key + repeat(" ", 2));
               printTree(node.right);
               //System.out.println(node.key);
               System.out.println("Here 1");
           }


            // left child only
           else if (!isEmpty(node.left) && isEmpty(node.right)) {
               System.out.println(repeat(" ", 2) + node.right.key);
               System.out.println(node.key);
               //System.out.println(node.key);
               System.out.println("Here 2");
           }

           // BOTH children exist
           else if (!isEmpty(node.left) && !isEmpty(node.right)) {
               //System.out.print(node.left.key + repeat(" ", 2));
               //System.out.println(repeat(" ", 2) + node.right.key);
               //System.out.println(repeat(" ", 2) + node.key + repeat(" ", 2));

               printTree(node.left);
               System.out.print(node.key + repeat(" ", 2));

               printTree(node.right);
               System.out.println(repeat(" ", 2) + node.key);
           }


    }

    void printTreeGo() {
        printTree(root);
    }*/

/*    public void printTree1(Node node) {
        if (node == null) {
            return;
        }

        printTree1(node.left);
        StdOut.println(node.key);
        printTree1(node.right);
    }*/

/*    int n = 0;
    public void printTree2(Node node) {

        if (isEmpty(node) == false) {

            // print them ascendingly
            inOrder(node.left);
            System.out.print(repeat(" ", n)+node.key);
            printTree2(node);
            n++;
            draw.append(root.key+" ");

            inOrder(node.right);

            // print them descendingly
*//*            print (root.right);
            System.out.println(root.key);
            print (root.left);*//*
        }
        return draw.toString();

    }*/
//*************************************************************************

    // TODO: In order: Left, Root, Right
    public void inOrder(Node node) {

        if (isEmpty(node) == false) {

            // print them ascendingly
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }

    // just initializing the insert method to have the root of the BST
    void inOrderGo() {
        inOrder(root);
    }


    // TODO: Pre order: Root, Left, Right
    public void preOrder(Node root) {

        if (isEmpty(root) == false) {

            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);


        }

    }

    // just initializing the insert method to have the root of the BST
    void preOrderGo() {
        preOrder(root);
    }


    // TODO: Post order: Left, Right, Root
    public void postOrder(Node root) {

        if (isEmpty(root) == false) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);

        }

    }
    // just initializing the insert method to have the root of the BST
    void postOrderGo() {  //
        postOrder(root);
    }

    // TODO: Search method
    public boolean isHere(Node node, int key) {

        if (node == null) {
            return false;
        }

        else if (node.key == key) {
            return true;
        }

        else if (key < node.key) {
            return isHere(node.left, key);

        }

        else if (key > node.key) {
            return isHere(node.right, key);
        }

        return true;
    }


    // just initializing the insert method to have the root of the BST
    public boolean isHereGo(int key) {
        return isHere(root, key);
        // System.out.println(isHere(root, key));
    }

    // TODO: Determine the minimum
    public Node min(Node node) {

        //if (isEmpty(node) == false) {

        if (node.left != null) {
            return min(node.left);
        }

        else if (node.left == null) {
            return node;
        }
        //}
        return node;
    }
//*************************************************************************
/*    void minGo() {
        min(root);
    }*/


    // public Node toString() {			// override toString method
    //   return(Node);
    // }
// *************************************************************************

    // TODO: Determine the maximum
    public Node max(Node node) {

        //if (isEmpty(node) == false) {

        if (node.right != null) {
            return max(node.left);
        } else if (node.right == null) {
            return node;
        }
        //}
        return node;
    }
//*************************************************************************
/*    void maxGo() {
        max(root);
    }*/
//*************************************************************************

    // TODO: Delete method
    public Node deleteWithMin(Node node, int key) {

        boolean find = isHereGo(key);

        if (node == null) {
            return null;
        }

        // keys of smaller values than the root exist on the left
        // if so, iterate to the left
        if (key < node.key) {
            node.left = deleteWithMin(node.left, key);
        }

        // keys of bigger value than the root exist on the right
        // if so, iterate to the right
        else if (key > node.key) {
            node.right = deleteWithMin(node.right, key);
        }

        // the program will always go through this "else" block if the node has any children
        else {

            // nodes with LEFT child ONLY
            // replace the LEFT child with the node, which we want to delete
            if (!isEmpty(node.left)) {
                node = node.left;
            }

            // nodes with RIGHT child ONLY
            // replace the RIGHT child with the node, which we want to delete
            else if (!isEmpty(node.right)) {
                node = node.right;
            }

            // BOTH children exist
            else if (!isEmpty(node.right) && !isEmpty(node.left)) {

                // get the min node from right.. RECALL: smaller keys exist on the right of the node
                // Replace it with the root
                Node newRoot = min(node.right);
                node.key = newRoot.key;

            }

            // NO children at all
            else {
                node = null;
            }
        }

        return node;

    }

    // just initializing the insert method to have the root of the BST
    void deleteMinGo(int value) {
        deleteWithMin(root, value);
    }

}











