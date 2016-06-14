package List;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by ZihanCong on 16/6/13.
 */
public class SingleLinkedList<E> implements Serializable{
    LinkedList list = new LinkedList();
    transient Node<E> first;
    transient Node<E> last;
    transient int size = 0;
    SingleLinkedList(E e) {
        //新建一个节点
        final Node<E> f = first;
        final Node<E> newNode = new Node<E>(e, f);
        first = newNode;
        //如果无节点,first,last均设为同一个节点
        if (f == null)
            last = newNode;
        size++;
    }

    public void add(int index,E element){
        //首先检查位置
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("Index: \"+index+\", Size: \"+size");
        else if (index == size)
            append(element);
        else {
            Node<E> prev = first;
            for(int i =0;i<index-1;i++)
                prev = prev.next;
            prev.next = new Node<>(element,prev.next);

        }
        size++;
    }
    public void append(E element){
        final Node<E> l = last;
        final Node<E> newNode = new Node<E>(element,null);
        last = newNode;
        if(l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
    public void remove(int index){
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("Index:"+index+ " Size:"+size);
        else if(index == 0){
            Node<E> x = first;
            first = first.next;
            x.item = null;
            x.next = null;
        }
        else if(index == size){
            Node<E> prev = first;
            for(int i =0;i<index-1;i++)
                prev = prev.next;
            prev.next.item = null;
            prev.next = null;
            last = prev;
        }
        else{
            Node<E> prev = first;
            for(int i =0;i<index-1;i++)
                prev = prev.next;
            prev.next.item = null;
            prev.next = prev.next.next;
        }
        size--;
    }
    public void clear(){
        for(Node<E> x = first;x!=null;x=x.next){
            x.item = null;
            x.next = null;
        }
        first = last = null;
        size = 0;

    }
    public E get(int index){
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("Index: \"+index+\", Size: \"+size");
        else if (index == 0)
            return first.item;
        else if (index == size)
            return last.item;
        else{
            Node<E> x = first;
            for(int i =0;i<index;i++)
                x = x.next;
            return x.item;
        }
    }
    public void print(){
        for(Node<E> x = first;x!=null;x=x.next){
            if(x.next == null)
                System.out.println(x.item);
            else
                System.out.print(x.item+" --> ");
        }
    }
    private static class Node<E>{
        E item;
        Node<E> next;
        Node(E element, Node<E> next){
            this.item = element;
            this.next = next;
        }
    }
}
