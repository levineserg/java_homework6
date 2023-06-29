package org.example;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        System.out.println(set1.add(555));
        System.out.println(set1.add(123));
        System.out.println(set1.remove(123));
        System.out.println(set1.remove(123));
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());

        set1.add(555);
        set1.add(123);
        String str = set1.toString();
        System.out.println(str);
        System.out.println(set1.getIndex(0));

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

    }
}
  static class  Set<E> {
      private HashMap<E, Object> set = new HashMap<>();
      private static final Object VALL = new Object();

      boolean add(E tel) {
          return set.put(tel, VALL) == null;

      }

      public boolean remove(E tel) {
          return set.remove(tel) == VALL;
      }

      public int size() {
          return set.size();
      }

      public boolean isEmpty() {
          return set.isEmpty();
      }

      public Iterator<E> iterator() {
          return set.keySet().iterator();

      }

      public String toString() {
          return set.keySet().toString();
      }
      public int getIndex(int index){
          return (Integer)set.keySet().toArray()[index];
      }

  }
}