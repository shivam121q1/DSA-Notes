package StackAndQueue.Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    // I dont want to change it ever that's why it is final
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
        // to call the constructor;
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
    return end==data.length-1; //ptr is at last index
}
public boolean isEmpty(){
    return end==0; //ptr is at initial last index
}
public boolean insert(int item){
    if(isFull()){
        return false;
    }
    data[end++] = item;
    return true;
}
public boolean delete(){
    if (isEmpty()) {
        return false;
        
    }
    for(int i =1 ; i< end; i++){
        data[i]=data[i+1];
    }
    end--;
    //Where complexity is O(n)
    return true;

}
public int front(){
    if (isEmpty()) {
        return -1;
        
    }
    return data[0];

}
public void display(){
    for (int i = 0; i < end; i++) {
        System.out.print(data[i]+ " ");
        
    }
    System.out.println("END");
}
}
