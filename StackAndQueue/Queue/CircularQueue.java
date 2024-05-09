package StackAndQueue.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    // I dont want to change it ever that's why it is final
    protected int end = 0;
    protected int front =0;
    private int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
        // to call the constructor;
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
    return size==data.length-1; //ptr is at last index
}
public boolean isEmpty(){
    return size==0; //ptr is at initial last index
}
public boolean insert(int item){
    if(isFull()){
        return false;
    }
    data[end++] = item;
    end = end % data.length;
    size++;
    return true;
}
public int delete(){
    if (isEmpty()) {
        return -1;
        
    }
    int removed = data[front];
    front = front % data.length;
    size--;
    //Where complexity is O(n)
    return removed;

}
public int front(){
    if (isEmpty()) {
        return -1;
        
    }
    return data[0];

}
public void display(){

    if(isEmpty()){
        System.out.println("Empty");
        return;
    }
    
   int i = front;
   do{
    System.out.println(data[i] + " ");
    i++;
    i%=data.length;
   }while(i!=end);
    System.out.println("END");
}
    
}
