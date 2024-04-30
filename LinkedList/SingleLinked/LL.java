package LinkedList.SingleLinked;

import org.w3c.dom.Node;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void  insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size+=1;
    }
    public void insertLast(int value){

        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        
            tail.next = node;
            tail = node;
            size++;
        
    }
    public void inset(int value , int index){
        if(index==0){
            insertFirst(value);
        }
        if(index== size){
            insertLast(value);
        }
        Node temp = head;
        for(int i =1 ; i< index; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }

    public void insertRec(int value,int index){
        
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int deleteFirst(){
        int val =head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value=tail.value;
        tail = secondLast;
        tail.next=null;
        return value;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
            
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;

        }
        return null;

    }



    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node= node.next;
            
        }
        return node;

    }



    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
