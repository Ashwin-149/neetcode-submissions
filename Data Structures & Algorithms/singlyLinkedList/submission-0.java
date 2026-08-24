

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }


    public int get(int index) {
        int count = 0;
        Node t = head;

        while (t != null) {
            if (count == index) {
                return t.data;
            }
            t = t.next;
            count++;
        }
        return -1;
    }


    public void insertHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }


    public void insertTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public boolean remove(int index) {

        
        if (head == null)
            return false;

        
        if (index == 0) {
            head = head.next;
            return true;
        }

        int count = 0;
        Node t = head;

        while (t.next != null) {
            if (count == index - 1) {
                t.next = t.next.next;
                return true;
            }
            t = t.next;
            count++;
        }

        return false; 
    }

    
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();

        Node t = head;
        while (t != null) {
            list.add(t.data);
            t = t.next;
        }

        return list;
    }
}