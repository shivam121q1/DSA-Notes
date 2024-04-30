package LinkedList.DoublyLinked;

public class DD {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev = null;
        if(head!=null){
            head.prev =node;

        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+ "->");
            last= node;
            node = node.next;
        }

        System.out.println();

        while(last!=null){
            System.out.print(last.value+"->");
            last= last.prev;

        }
        System.out.println("END");
    }
    public void insertLast(int val){

        Node node = new Node(val);
        Node last = head;
        if(head==null){
           node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;

        }
        last.next= node;
        node.prev=last;
        

    }
    

    
    



   



    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value= value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next= next;
            this.prev = prev;
        }
    }
    
    
}
