class MyLinkedList {
    class Node{
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
    int size;


    public MyLinkedList() {
        head = new Node();
        size = 0;
    }


    public int get(int index) {
        return getNode(index).val;
    }

    public Node getNode(int index){
        if(index > size - 1){
            Node node = new Node(-1);
            System.out.println("failedGet");
            return node;
        }
        Node temp = new Node();
        temp = head;
        for(int i = 0; i <= index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addAtHead(int val) {
        Node add = new Node(val);
        Node temp = new Node();
        temp = head.next;
        head.next = add;
        add.next = temp;
        size++;
    }

    public void addAtTail(int val) {
        //System.out.println("size = " + size);
        Node node = getNode(size - 1);
        Node add = new Node(val);
        node.next = add;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        Node node = getNode(index - 1);
        Node add = new Node(val);
        Node temp = node.next;
        node.next = add;
        add.next = temp;
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index > size - 1){
            return;
        }
        Node node = getNode(index - 1);
        if(node.next == null){
            node.next = null;

        }else{
            Node temp = node.next.next;
            node.next = temp;
        }
        size--;

    }

    @Override
    public String toString() {
        String result = "";
        Node temp = new Node();
        if(head != null){
            temp = head.next;
        }
        while(temp != null){
            result += temp.val + " ";
            temp = temp.next;
        }
        return result;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */