package Assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {

    private Queue<T> queue;
    public Object objLock = new Object();

    public ConcurrentQueue(){
        queue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (objLock){
            queue.add(data);
        }

    }

    public T remove(){
        T data;

        synchronized (objLock){
            data = queue.remove();
        }
        return data;
    }


    public boolean isEmpty(){
        boolean isEmpty;
        synchronized (objLock){
            isEmpty = queue.isEmpty();
        }

        return isEmpty;
    }

    public T peek(){
        synchronized (objLock){
            return queue.peek();
        }

    }

}