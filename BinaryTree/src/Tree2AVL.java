class Tree2AVL {

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public Tree2AVL() {

    }



    public void insert(int value){
        root= insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
//            node = new Node(value);         //here it will look out if the element to the left or to the right of the node is null or nt and if it
            return new Node(value);                  //is null then the no. to be inserted will be returned in place of the null type
        }
        if(value < node.getValue()) {
            node.left = insert(value, node.left);  //here in this it will be checking if the node is bigger or lesser than the no. we will be inserting
        }// here in this DS, if it is lesser then, it will look to the left of the node if there exist a value in the left of the node then the same
        // number would be returned to the node as the value to the node.left but if there exist nothing then the element we had here will be
        // inserted and then get retruned to the node as specified in above step

        else if(value > node.getValue()){
            node.right = insert(value, node.right); //here in this it will be checking if the node is bigger or lesser than the no. we will be inserting
        }// here in this DS, if it is lesser then, it will look to the right of the node if there exist a value in the right of the node then the same
        // number would be returned to the node as the value to the node.right but if there exist nothing then the element we had here will be
        // inserted and then get returned to the node as specified in above step

        node.height = Math.max(height(node.left), height(node.right)) + 1;  //here then after in the DS the height fo the DS would be increased as well after
        // inserting the element to the BST
        return rotate(node);
    }       //Here in this the same recursive process is being repeated in which the recursion would be followed and then in the ned the AVL tree algorithm
    // for rotating the tree would be called and then would be rotated by following the four rules and then will return the node in hte end and then after
    // returnin ghte node of the subtree which is unbalanced would be returned

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left left case
                return  rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left = leftRotate(node.left);
                return  rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < 0 ){
                //right heavy
                if(height(node.right.right) - height(node.right.left) > 0){
                    //right right case
                    return  leftRotate(node);
                }
                if(height(node.right.right) - height(node.right.left) < 0){
                    //right left case
                    node.left = rightRotate(node.right);
                    return  leftRotate(node);
                }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;

    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;

    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);                   //Here what is happening is i m giving u an array and run the array multiple times on it and
            // functions like insert function on it without writing command line again & again
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    /* Here in this section it will be acessing with the array been sorted out already in the dataset, as a result of which the tree can become skewed and thus the
    balancing can be compromised hence in this way the data points will be broken down in half and the middle evnt will be broken down in this awy to organize the tree
     */

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public void display(){
        display(this.root, "Root Node: ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");

    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }


    public boolean balanced(){
        return balanced(root);   //here in this the tree or the branch of the binary tree would be looked into if the branch or the tree is balanced or not
    }

    private boolean balanced (Node node){
        if(node == null){        //here the balncing of the tree would be done form the below and then reach out after calling off back to the parent node
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right); //here the balancing is being checked
        // if the tree is balanced or ntwhic is checked after reviwing that the difference is lesser than or equal to 1 and then after that teh value of
        // the values to the left and right of the node r being reviwed if they r true or nt
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

    }

    public void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);

    }

    public void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");


    }
}