public class BST<Key extends Comparable<Key>, Value> {

    private Node root;
    private class Node {

        private Key key;
        private Value val;
        private Node left, right = null;
        private int N;

        // set the left and right child to be null as a start



        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    // method for inserting

    public void insert(int key){

    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        else {
            return x.N;  // IS THIS THE HEIGHT?
        }
    }

    // TODO: Search & insert

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get (Node x, Key key) {

        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            return get(x.left, key);  // MEH?????
        }

        else if (cmp > 0) {
            return get(x.right, key);   // MEH?????
        }

        else {
            return x.val;
        }
    }

    private Node put(Node x, Key key, Value val) {

        if (x == null) {
            return new Node(key, val, 1);
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = put(x.left, key, val);
        }

        else if (cmp > 0) {
            x.right = put(x.right, key, val);
        }

        else {
            x.val = val;
        }

        x.N = size(x.left) + size(x.right) + 1;  //WHAT'S HAPPENING?
        return x;
    }
}
