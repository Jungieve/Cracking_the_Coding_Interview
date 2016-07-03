package Stack.MyStack;

import List.ListNode;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by ZihanCong on 16/7/3.
 */
public class MyStackByListImpl<T> implements MyStack<T> {
    private int size;
    private ListNode top;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public T push(T item) {
        //push时候,每次把新的结点增加到链表前面
        ListNode listNode = new ListNode(item);
        //如果没有元素
        if(top == null)
            top = listNode;
        else{
            listNode.next = top;
            top = listNode;
        }
        size++;
        return item;
    }

    @Override
    public T pop(T item) {
        //通过调用peek函数预先判断stack是否为空
        T obj = peek();
        top = top.next;
        size--;
        return obj;
    }

    @Override
    public T peek() {
        if(size == 0)
            throw new EmptyStackException();
        return (T)top.val;
    }
}
