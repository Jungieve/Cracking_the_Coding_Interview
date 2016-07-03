package Stack.MyStack;


/**
 * Created by ZihanCong on 16/7/3.
 * 链表实现一个栈
 */
public interface MyStack<T> {
    boolean isEmpty();
    void clear();
    int length();
    T push(T item);
    T pop();
    T peek();
    void printStack();
}
