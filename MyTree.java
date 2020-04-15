import tree.LinkedBinarySearchTree;

public class MyTree<T> implements Frontier<T>{
  private LinkedBinarySearchTree <T> tree;

  public MyTree(){
    tree =  new LinkedBinarySearchTree<T> ();
  }

  public void add(T newItem){
    // TO BE IMPLEMENTED
    tree.addElement(newItem);
  }

  public T remove(){
    // TO BE IMPLEMENTED
    return tree.removeMin();
  }

  public int size(){
    // TO BE IMPLEMENTED
    return tree.size();
  }
}