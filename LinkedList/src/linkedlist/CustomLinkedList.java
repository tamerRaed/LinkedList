package linkedlist;
//By:Tamer Raid Al Naizi, ID:1201707707.

public class CustomLinkedList<E> {

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public int getSize() {
        return size;
    }

    public void addAtHead(E data) {
        if (size == 0) {
            head = new Node(data);
            tail = head;
        } else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
        size = size + 1;
    }

    public void addAtTail(E data) {
        if (size == 0) {
            tail = new Node(data);
            head = tail;
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        size = size + 1;
    }

    public void addAtIndex(int index, E data) {
        if (index == 0) {
            addAtHead(data);

        } else if (index == size - 1) {
            addAtTail(data);

        } else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                }
                if (i == index) {
                    Node newNode = new Node(data);
                    previous.next = newNode;
                    newNode.next = current;
                    size = size + 1;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void deleteHead() {
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size = size - 1;
    }

    public void deleteTail() {
        if (size == 1) {
            tail = head = null;
            size = size - 1;
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == size - 2) {
                    tail = current;
                    tail.next = null;
                    size = size - 1;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void deleteIndex(int index) {
        if (index == 0) {
            deleteHead();

        } else if (index == size - 1) {
            deleteTail();

        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                } else if (i == index) {
                    previous.next = current.next;
                    size = size - 1;
                    break;
                }
                current = current.next;
            }
        }
    }

    //find the index and use deletIndex
    public void remove(E data) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (contains(data)) {
                index = i;
                break;
            } else {
                System.out.println("Not Found!!");
            }
        }
        deleteIndex(index);
    }

    //cheak if the E data Found or Not by Comparable
    public boolean contains(E data) {
        boolean cheak = false;
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (data instanceof Comparable) {
                if (((Comparable) temp.data).compareTo(data) == 0) {
                    cheak = true;
                    break;
                } else {
                    if (temp.equals(data)) {
                        cheak = true;
                        break;
                    }
                }
            }
            temp = temp.next;
        }
        return cheak;
    }

}
