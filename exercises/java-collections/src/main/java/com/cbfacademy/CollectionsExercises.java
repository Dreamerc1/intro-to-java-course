package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        //throw new RuntimeException("Not implemented");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.addLast(2);
        integers.set(2,4);
        System.out.println(integers.element());
        return integers;

    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        //throw new RuntimeException("Not implemented");
        Stack<Integer> stackElement = new Stack<>();
        stackElement.add(5);
        stackElement.add(6);
        stackElement.add(8);
        stackElement.add(9);
        System.out.println(stackElement.get(0));
        System.out.println(stackElement.get(3));
        System.out.print(stackElement.pop());
        System.out.println(stackElement.elements());
        stackElement.push(4);
        return stackElement;

    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> de = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        de.addFirst(5);
        de.add(6);
        de.add(8);
        de.add(9);
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(de.poll());
        System.out.println(de.element());
        return de;
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        //throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer,String> hm = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        hm.put(1,"TypeScript");
        //  - add {2, Kotlin} entry to the map
        hm.put(2,"Kotlin");
        //  - add {3, Python} entry to the map
        hm.put(3, "Python");
        //  - add {4, Java} entry to the map
        hm.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hm.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        hm.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.println(hm.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.println(hm.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.println(hm.containsValue("English"));
        //  - return the map
        return hm;
        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
