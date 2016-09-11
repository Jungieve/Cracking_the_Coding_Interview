package Techs.Java;

import java.util.Iterator;

/**
 * Created by root on 2016/9/11.
 */
public class CircularArray<T> implements Iterable<T>{
    private T[] items;
    private int head = 0;
    //为了无法解决泛型数组，必须将一个Object[]强制转型为T[]
    public CircularArray(int size){
        items = (T[]) new Object[size];
    }
    private int convert(int index){
        //因为负数%正数时候，返回赋值，我们必须在负数索引上加上items.lengtjh
        if(index < 0)
            index+=items.length;
        return (head+index)%items.length;
    }
    //代码复用
    public void rotate(int shiftRight){
        head = convert(shiftRight);
    }
    public T get(int i){
        if( i < 0 || i>= items.length)
            throw new IndexOutOfBoundsException();
        return items[convert(i)];
    }
    public void set(int i,T item) {
        items[convert(i)] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new CircularArrayIterator<T>(this);
    }
    private class CircularArrayIterator<T1> implements Iterator{
        //_current反应从旋转后的开头算起的偏移量，而不是从原始数组的开头开始算
        private int _current = -1;
        private T1[] _items;
        public CircularArrayIterator(CircularArray<T1> ts) {
            _items = ts.items;
        }

        @Override
        public boolean hasNext() {
            return _current < items.length-1;
        }

        @Override
        public Object next() {
           _current++;
            T1 item = (T1) _items[convert(_current)];
            return item;
        }

    }
}

