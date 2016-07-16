package JavaDataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ZihanCong on 16/7/16.
 */
public class Set2Map<K,V> extends HashSet<SimpleEntry<K,V>> {
    public void clear(){
        super.clear();
    }

    public boolean containsKey(K key){
        return super.contains(new SimpleEntry<K, V>(key,null));
    }

    public boolean containsValue(V value){
        for(SimpleEntry<K,V> se:this){
            if (se.getValue().equals(value))
                return true;
        }
        return false;
    }

    public V get(K key){
        for(SimpleEntry<K,V> se:this){
            if(se.getKey().equals(key))
                return se.getValue();
        }
        return null;
    }

    public V put(K key,V value){
        add(new SimpleEntry<K, V>(key,value));
        return value;
    }

    public void removeAll(Map<? extends K,? extends V> m){
        for(K key:m.keySet()){
            add(new SimpleEntry<K, V>(key,m.get(key)));
        }
    }

    public V removeEntry(Object key){
        for(Iterator<SimpleEntry<K,V>> it = this.iterator();it.hasNext();){
            SimpleEntry<K,V> en = it.next();
            if(en.getKey().equals(key)){
                V v = en.getValue();
                it.remove();
                return v;
            }
        }
        return null;
    }
}
