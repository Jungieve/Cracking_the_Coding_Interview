package Stack_Queue.MyStack;


/**
 * Created by ZihanCong on 16/7/3.
 * 链表实现一个栈
 */
public interface MyStack<T> {
    boolean isEmpty();
    void clear();
    int length();
    void printStack();
    //栈的方法函数
    T peek();
    T push(T item);
    T pop();

}
