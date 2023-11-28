import java.lang.reflect.Array;
import java.util.Arrays;

public class CISQueue {

    // Array property.
    private Integer[] array;
    // Size property.
    private int size;
    // Index pointer. Indicates the index of the most recently added element.
    private int pointer;
    // Constructor.
    CISQueue(int size){
        this.array = new Integer[size];
        this.size = 0;
        this.pointer = -1;
    }
    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(int a){
        array[size] = a;
        size +=1;
        pointer +=1;
    }
    // Dequeue. This method removes a node from the beginning of the linked list.
    public Integer dequeue(){
        Integer a = array[0];
        array[0] = 0;
        reshuffle();
        if(size > 0) {
            size -= 1;
            pointer -=1;
        }
        return a;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }
    // reshuffle. Moves each element down one index. Called whenever we dequeue.
    public void reshuffle(){
        for(int i = 0; i < size; i++){
            array[i] = array[i + 1];
        }
        array[size] = 0;
    }

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(array) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }
    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2, pointer=1}

}
