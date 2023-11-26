public class SegmentTree {
    private static class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;

        public Node (int startinterval, int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }


    Node root;

    public SegmentTree(int[] arr) {
        //create a tree
        this.root = constructTree(arr, 0, arr.length - 1); //here the array is being defined to make the segment tree and define its length from
    }                                                                // the starting index to the length of the array


    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            //leaf node
            Node leaf = new Node(start, end);// here in this after getting the root node of the segemnt tree it will initialize the tree to get the
                                                        // array type arragement get started
            leaf.data = arr[start];//Started from left and continued till ends with the left side
            return leaf;
        }

        //create the new node with index you are at
        Node node = new Node(start, end);

        int mid = (start + end) / 2;    //divide the array in two halves to start the segmenting of that array in tree by keep on dividing it in half
                                                                // till we got in seperate indices

        node.left = this.constructTree(arr, start, mid);     //start the same constructTree for the left and right side of node and begin the same process
        node.right = this.constructTree(arr, mid+1, end);

        node.data =  node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "interval=[" + node.left.startinterval + "-" + node.left.endinterval + "] and data:" + node.left.data + " + => ";
        } else {
            str = str + "No left child";
        }

        //for the current node
        str = str + "interval=[" + node.startinterval + "-" + node.endinterval + "] and data:" + node.data + " + => ";


        if (node.right != null) {
            str = str + "interval=[" + node.right.startinterval + "-" + node.right.endinterval + "] and data:" + node.right.data + " + => ";
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        //call recursion
        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }

    //query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei){
        if(node.startinterval >= qsi && node.endinterval <= qei){
            //node is completely lying inside query
            return node.data;
        } else if (node.startinterval > qei || node.endinterval < qsi) {
            //completely outside
            return 0;
        }else{
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    //update
    public void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if(index >= node.startinterval && index <= node.endinterval){
            if(index == node.startinterval && index == node.endinterval){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
