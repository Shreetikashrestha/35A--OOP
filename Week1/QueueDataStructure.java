import java.util.Queue;

public class QueueDataStructure {
public static void main(String[] args) {
    
}
    
    
}
class QueueData{
    int capacity;
    int front ;
    int rear;
    int currentSize;
    int queueArr[];

    QueueData(int capacity){
        this.capacity =capacity;
        front = 0;
        rear = -1 ;
        queueArr = new int[this.capacity];

    }
    public boolean isFull(){
        if (currentSize==capacity){
            System.out.println("Full");
            return true;
        }
        return false;

    }
    public boolean isEmpty(){
        if(currentSize==0){
            System.out.println("Empty");
            return true;
        }
        return false;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;


        }
        return queueArr[front];

    }

    //add data to arr/ enqueue
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Full");
        }else {
            rear++
            if(rear == capacity -1 ){
                rear = 0;
            }
            queueArr[rear]= data;
            currentSize++;

        }
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1 ;
        }else{
            front ++;
            currentSize --;
            if (front ==capacity -1 ){
                return queueArr[front --];

            }else{
                return queueArr[front -1];
            }
        }
    }
}
