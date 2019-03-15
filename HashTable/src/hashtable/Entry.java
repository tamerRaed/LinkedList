/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author hp
 */
public class Entry<E, T> {

    E Key;
    T value;

    public E getKey() {
        return Key;
    }

    public void setKey(E Key) {
        this.Key = Key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Entry(E Key, T value) {
        this.Key = Key;
        this.value = value;
    }

}
