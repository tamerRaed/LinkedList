package hashtable;

public class Hashtable<E, T> {

    int limit = 115000;
    int size = 0;
    Object[] entries;

    public Hashtable() {
        entries = new Object[limit];
    }

    public boolean put(E Key, T value) {
        Entry<E, T> entry = new Entry(Key, value);
        int index = Math.abs(Key.hashCode()) % limit;
        for (int i = index; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = entry;
                return true;
            }

        }
        return false;
    }
    
    public T getValue(E key){
        Entry<E,T> entry=null;
        int index = Math.abs(key.hashCode()) % limit;
        
        for (int i = index; i < entries.length; i++) {
            if ((Math.abs(((Entry)entries[i]).getValue().hashCode())) % limit==index) {
                return (T)entry.getValue();
                
            }

        }
        return null;
    }
}
