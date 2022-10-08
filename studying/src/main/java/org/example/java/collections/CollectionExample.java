package org.example.java.collections;

import com.sun.source.tree.IdentifierTree;

import java.util.*;

public class CollectionExample {
    //   public static void main(String[] args) {
//        List collection = new ArrayList<>();
//        Set collection2 = new HashSet();
//        Queue collection3 = new PriorityQueue();
//        Map map = new HashMap();
//
//        collection.add("1");
//        collection.add("2");
//        collection.add("3");
//        collection.remove("2");
//        for (Object o : collection){
//            System.out.println(o);
//        }


//    public static void main(String[] args) {
//        Queue collection = new PriorityQueue();
//        collection.offer("1");
//        collection.offer("2");
//        collection.offer("3");
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(collection.peek());
//        }
//        System.out.println("num of elements " + collection.size());
//    }

//    public static void main(String[] args) {
//        Set collection = new HashSet();
//        collection.add("1");
//        collection.add("2");
//        collection.add("2");
//        collection.add("2");
//        collection.add("2");
//        collection.add("3");
//        collection.add("3");
//        collection.add("3");
//        for (Object o : collection) {
//            System.out.println(o);
//        }
//    }
class Book{
        String nameAutor;

        public Book(String nameAutor){
            this.nameAutor = nameAutor;
        }
        @Override
        public String toString(){
            return "Book{" +
                    "nameAutor='" + nameAutor + '\'' + '}';

        }
}

//    public static void main(String[] args) {
//        Collection collection;
//        List list;
//        Set set;
//        Queue queue;
//        Map collection = new HashMap();
//        collection.put("1", "Dan Brown");
//        collection.put("2", "Karnegi");
//        collection.put("3", "Jack London");
//       //     System.out.println(collection.get("2"));
//        Set set = collection.keySet();
//        for (Object o : set) {
//            System.out.println(o);
//        }
//    }
//

    public static void main(String[] args) {
        Collection collection = new LinkedHashSet();
        collection.add("2");
        collection.add("3");
        collection.add("1");
        for(Object o : collection){
            System.out.println(o);
        }

    }
}

