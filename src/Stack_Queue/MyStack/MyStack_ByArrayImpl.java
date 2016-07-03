package Stack_Queue.MyStack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by ZihanCong on 16/7/3.
 */
public class MyStack_ByArrayImpl<T> implements MyStack<T> {
    private Object[] objs = new Object[10];
    private int size;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while(size != 0){
            objs[--size] = null;
        }
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public T push(T item) {
        //如果数组容量到达最大
        if(size == (objs.length-1)){
            //扩容
            int newCapacity = ((objs.length>>1)>1)?(objs.length+(objs.length>>1)):(objs.length+1);
            //复制数组
            objs = Arrays.copyOf(objs, newCapacity);
        }
        objs[size++] = item;
        return item;
    }

    @Override
    public T pop() {
        T obj = peek();
        objs[--size] = null;
        return obj;
    }

    @Override
    public T peek() {
        if (size == 0)
            throw new EmptyStackException();
        return (T)objs[size-1];
    }

    @Override
    public void printStack() {
        for(int i = 0;i<size;i++){
            System.out.print(objs[i]+"->");
        }
    }
}
