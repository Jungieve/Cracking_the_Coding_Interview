package JavaDataStructure;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by ZihanCong on 16/7/16.
 */
public class SimpleEntry<K,V> implements Map.Entry,Serializable {
    private final K key;
    private V value;

    public SimpleEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public SimpleEntry(Map.Entry<? extends K,? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(Object value) {
        V oldValue = this.value;
        this.value = (V)value;
        return oldValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() == SimpleEntry.class){
            SimpleEntry se = (SimpleEntry)o;
            return se.getKey().equals(getKey());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return key == null ? 0 :key.hashCode();
    }

    @Override
    public String toString(){
        return key + "=" +value;
    }
}
