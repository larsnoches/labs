package com.company;

class Node {
    public int value;
    public Node next;

    public Node(int value, Node next)
    {
        this.next = next;
        this.value = value;
    }
}

public class Lab08_17_06 {
    public Node head = null;
    public Node tail = null;

    public void createHead(int size)
    {
        for (int i = size - 1; i >= 0; i--) {
            head = new Node(i, head);
        }
    }

    public void createHeadRec(int size)
    {
        if (size > 0) {
            head = new Node(size - 1, head);
            createHeadRec(size - 1);
        }
    }

    public void createTail(int size)
    {
        head = new Node(0, null);
        tail = head;
        for (int i = 1; i < size; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }
    }

    public void createTailRec(int size, int pos)
    {
        if (pos == 0) {
            head = new Node(0, null);
            tail = head;
            createTailRec(size, pos + 1);
        }
        else if (pos < size) {
            tail.next = new Node(pos, null);
            tail = tail.next;
            createTailRec(size, pos + 1);
        }
    }

    @Override
    public String toString()
    {
        String result = "";
        Node ref = head;
        while (ref != null) {
            result += " " + String.valueOf(ref.value) + " ";
            ref = ref.next;
        }
        return result;
    }

    public String toStringRec(Node ref)
    {
        String result = "";
        if (ref != null) {
            result += " " + String.valueOf(ref.value) + " ";
            ref = ref.next;
            result += toStringRec(ref);
        }
        return result;
    }

    public void addFirst(int number)
    {
        head = new Node(number, head);
    }

    public void addLast(int number)
    {
        if (tail != null) {
            Node newTail = new Node(number, null);
            Node ref = tail;
            ref.next = newTail;
        }
        else {
            tail = new Node(number, null);
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = tail;
        }
    }

    public void insert(int number, int index)
    {
        Node node = new Node(number, null);
        Node ref = head;
        int k = 0;
        while (ref != null && (k < index)) {
            ref = ref.next;
            k++;
        }

        node.next = ref.next.next;
        ref.next = node;
    }

    public void removeFirst()
    {
        head = head.next;
    }

    public void removeLast()
    {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        tail = ref;
    }

    public void remove(int index)
    {
        Node ref = head;
        int k = 0;
        int ind = index > 0 ? index - 1 : index;
        while (ref.next != null && (k < ind)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    public static void main(String[] args) {
        Lab08_17_06 lab = new Lab08_17_06();
        lab.createHead(10);
        System.out.println("createHead:");
        System.out.println(lab.toString());


        lab.addFirst(11);
        System.out.println("addFirst (11):");
        System.out.println(lab.toString());

        lab.addLast(12);
        System.out.println("addLast(12):");
        System.out.println(lab.toString());

        lab.insert(11, 2);
        System.out.println("insert(11 at 2):");
        System.out.println(lab.toString());

        lab.removeFirst();
        System.out.println("removeFirst:");
        System.out.println(lab.toString());

        lab.removeLast();
        System.out.println("removeLast:");
        System.out.println(lab.toString());

        lab.remove(3);
        System.out.println("remove 3:");
        System.out.println(lab.toString());


        Lab08_17_06 labHeadRec = new Lab08_17_06();
        System.out.println("createHeadRec and toStringRec:");
        labHeadRec.createHeadRec(10);
        System.out.println(labHeadRec.toStringRec(labHeadRec.head));


        Lab08_17_06 labTail = new Lab08_17_06();
        labTail.createTail(10);
        System.out.println("createTail:");
        System.out.println(labTail.toString());

        Lab08_17_06 labTailRec = new Lab08_17_06();
        labTailRec.createTailRec(10, 0);
        System.out.println("createTailRec and toStringRec:");
        System.out.println(labTailRec.toStringRec(labTailRec.head));
    }
}
