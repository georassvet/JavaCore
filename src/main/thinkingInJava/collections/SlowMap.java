package main.thinkingInJava.collections;

import java.util.*;

public class SlowMap<K,V> extends AbstractMap<K,V> {

    private List<K> keys =new ArrayList<>();
    private List<V> values =new ArrayList<>();

    public V  put(K key, V value){
        V oldValue = get(key);
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else{
            values.set(keys.indexOf(key),value);
        }
        return oldValue;
    }
    public V get(Object key){
        if(keys.contains(key)){
            return  values.get(keys.indexOf(key));
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<>();
        Iterator<K> ik = keys.iterator();
        Iterator<V> iv = values.iterator();

        while(ik.hasNext()){
            set.add(new MapEntry(ik.next(),iv.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String,String> slowMap = new SlowMap<>();
        slowMap.put("Russia","Moscow");
        slowMap.put("Germany","Berlin");
        slowMap.put("USA","New York");

        System.out.println(slowMap);

        System.out.println(slowMap.entrySet());


    }
}
class MapEntry<K,V> implements Map.Entry<K,V>{

    private K key;
    private V value;

    public MapEntry(K key, V value){
        this.key = key;
        this.value = value;
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
    public V setValue(V value) {
        V result = this.value;
        this.value=value;
        return result;
    }

    public int hashCode(){
        return (key==null ? 0 : key.hashCode())^ (value==null ? 0:value.hashCode());
    }
    public boolean equals(Object obj){
        if(!(obj instanceof MapEntry))return false;
        MapEntry me = (MapEntry)obj;
        return key==null? me.getKey()==null : key.equals(me.getKey())
                && value==null? me.getValue() == null : value.equals(me.getValue());
    }

    @Override
    public String toString() {
        return key + " : "+ value;
    }
}
