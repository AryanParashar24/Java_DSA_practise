public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size ++;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        //Here in this the value will be deleted of the index we have filled in the code by running the code till the number previous to the index we
        // have requested for & then filling the next number to the filled number as the number next to the target index
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;

        while(node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

// here wht it does is that the temp will be assigned to each and every element in the list from the head and will be proceeded to the further next item
// in the list and as it moves forward till it reaches to the final product in the list when the next element is null in the list

    // In this way the value of each and every element in the list will be printed in the same way from the starting to the end of the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
