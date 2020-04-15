import java.util.LinkedList;

public class MyQueue<T> implements Frontier<T>{
  private LinkedList<T> queue;

  public MyQueue(){
    queue = new LinkedList<T>();
  }

  public void add(T newItem){
    // TO BE IMPLEMENTED
    queue.add(newItem);
  }

  public T remove(){
    // TO BE IMPLEMENTED
    return queue.remove();
  }

  public int size(){
    // TO BE IMPLEMENTED
    return queue.size();
  }
}